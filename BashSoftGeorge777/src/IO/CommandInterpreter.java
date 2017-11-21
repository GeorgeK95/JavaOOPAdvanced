package IO;


import IO.commands.*;
import contracts.*;
import exceptions.InvalidInputException;

import java.io.IOException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class CommandInterpreter implements Interpreter {

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
            Command command = parseCommand(line, data, commandName);
            command.execute();
        } catch (Throwable t) {
            OutputWriter.writeException(t.getMessage());
        }
    }

    private Command parseCommand(String line, String[] data, String command) throws IOException {
        switch (command) {
            case "mkdir":
                return new MakeDirectoryCommand(line, data, this.ioManager, this.tester, this.downloadManager, this.studentsRepository);
            case "is":
                return new TraverseFoldersCommand(line, data, this.ioManager, this.tester, this.downloadManager, this.studentsRepository);
            case "cmp":
                return new CompareFilesCommand(line, data, this.ioManager, this.tester, this.downloadManager, this.studentsRepository);
            case "changedirrel":
                return new ChangeRelativePathCommand(line, data, this.ioManager, this.tester, this.downloadManager, this.studentsRepository);
            case "changedirabs":
                return new ChangeAbsolutePathCommand(line, data, this.ioManager, this.tester, this.downloadManager, this.studentsRepository);
            case "readdb":
                return new ReadDatabaseCommand(line, data, this.ioManager, this.tester, this.downloadManager, this.studentsRepository);
            case "download":
                return new DownloadFileCommand(line, data, this.ioManager, this.tester, this.downloadManager, this.studentsRepository);
            case "downloadasync":
                return new DownloadAsynchCommand(line, data, this.ioManager, this.tester, this.downloadManager, this.studentsRepository);
            case "open":
                return new OpenFileCommand(line, data, this.ioManager, this.tester, this.downloadManager, this.studentsRepository);
            case "help":
                return new GetHelpCommand(line, data, this.ioManager, this.tester, this.downloadManager, this.studentsRepository);
            case "show":
                return new ShowCourseCommand(line, data, this.ioManager, this.tester, this.downloadManager, this.studentsRepository);
            case "filter":
                return new PrintFilteredStudentsCommand(line, data, this.ioManager, this.tester, this.downloadManager, this.studentsRepository);
            case "order":
                return new PrintOrderedStudentsCommand(line, data, this.ioManager, this.tester, this.downloadManager, this.studentsRepository);
            case "dropdb":
                return new DropDatabaseCommand(line, data, this.ioManager, this.tester, this.downloadManager, this.studentsRepository);
            case "display":
                return new DisplayCommand(line, data, this.tester, this.studentsRepository, this.downloadManager, this.ioManager);
            default:
                throw new InvalidInputException(line);
        }
    }
}
