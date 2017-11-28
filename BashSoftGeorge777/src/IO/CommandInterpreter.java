package IO;


import annotations.Alias;
import annotations.Inject;
import contracts.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class CommandInterpreter implements Interpreter {

    private static final String COMMANDS_PATH = "src/IO/commands";
    private static final String COMMANDS_PACKAGE = "IO.commands.";

    private DirectoryManager ioManager;
    private ContentComparer tester;
    private Downloader downloadManager;
    private Database studentsRepository;

    CommandInterpreter(DirectoryManager ioManager, ContentComparer tester, Downloader downloadManager, Database studentsRepository) {
        this.ioManager = ioManager;
        this.tester = tester;
        this.downloadManager = downloadManager;
        this.studentsRepository = studentsRepository;
    }

    public void interpretCommand(String line) throws IOException {
        String[] data = line.split("\\s+");
        String commandName = data[0].toLowerCase();
        try {
            Executable command = parseCommand(line, data, commandName);
            command.execute();
        } catch (Throwable t) {
            OutputWriter.writeException(t.getMessage());
        }
    }

    private Executable parseCommand(String line, String[] data, String command) throws IOException {
        File commandsFolder = new File(COMMANDS_PATH);
        Executable executable = null;

        for (File file : commandsFolder.listFiles()) {
            if (!file.isFile() || !file.getName().endsWith(".java")) {
                continue;
            }
            try {
                String className = file.getName()
                        .substring(0, file.getName().lastIndexOf('.'));
                Class<Executable> exeClass = (Class<Executable>) Class.forName(COMMANDS_PACKAGE + className);

                if (!exeClass.isAnnotationPresent(Alias.class)) {
                    continue;
                }
                Alias alias = exeClass.getAnnotation(Alias.class);
                String value = alias.value();
                if (!value.equalsIgnoreCase(command)) {
                    continue;
                }

                Constructor exeCtor = exeClass.getConstructor(String.class, String[].class);
                executable = (Executable) exeCtor.newInstance(line, data);
                this.injectDependencies(executable, exeClass);
            } catch (ReflectiveOperationException rfe) {
                rfe.printStackTrace();
            }
        }

        return executable;
    }

    private void injectDependencies(Executable executable, Class<Executable> exeClass) throws ReflectiveOperationException {
        Field[] exeFields = exeClass.getDeclaredFields();
        for (Field fieldToSet : exeFields) {
            if (!fieldToSet.isAnnotationPresent(Inject.class)) {
                continue;
            }
            fieldToSet.setAccessible(true);

            Field[] theseFields = CommandInterpreter.class.getDeclaredFields();
            for (Field thisField : theseFields) {
                if (!thisField.getType().equals(fieldToSet.getType())) {
                    continue;
                }
                thisField.setAccessible(true);
                fieldToSet.set(executable, thisField.get(this));
            }
        }
    }
}
