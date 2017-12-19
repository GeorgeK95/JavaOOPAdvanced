package cresla.interpreters;

import cresla.annotations.InjectArgs;
import cresla.commands.Executable;
import cresla.interfaces.Manager;
import cresla.interfaces.Parser;
import cresla.utils.InputParser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class CommandInterpreter implements Interpreter {
    private static final String PACKAGE = "cresla.commands.";
    private static final String COMMAND_SUFFIX = "Command";
    private Manager system;
    private Parser parser;

    public CommandInterpreter(Manager  system) {
        this.system = system;
        this.parser = new InputParser();
    }

    @Override
    public Executable interpretCommand(String line) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String[] params = this.parser.parseInputAsArray(line);
        /*class->ctor->newInstance*/
        Class<Executable> clazz = (Class<Executable>) Class.forName(PACKAGE + params[0] + COMMAND_SUFFIX);
        Constructor<Executable> ctor = clazz.getDeclaredConstructor(Manager.class);
        Executable executable = ctor.newInstance(this.system);
        this.injectDependencies(executable, params);
        return executable;
    }

    private void injectDependencies(Executable executable, String[] params) throws IllegalAccessException {
        for (Field field : executable.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(InjectArgs.class)) {
                field.setAccessible(true);
                field.set(executable, params);
                break;
            }
        }
    }
}
