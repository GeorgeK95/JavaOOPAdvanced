package IO.commands;

import IO.OutputWriter;
import contracts.ContentComparer;
import contracts.Database;
import contracts.DirectoryManager;
import contracts.Downloader;
import exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class DropDatabaseCommand extends Command {

    public DropDatabaseCommand(String line, String[] data, DirectoryManager ioManager, ContentComparer tester, Downloader downloadManager, Database studentsRepository) {
        super(line, data, ioManager, tester, downloadManager, studentsRepository);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 1) {
            throw new InvalidInputException(this.getLine());
        }
        this.getStudentsRepository().unloadData();
        OutputWriter.writeMessageOnNewLine("Database dropped.");
    }
}
