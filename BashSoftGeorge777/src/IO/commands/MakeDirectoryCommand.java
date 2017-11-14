package IO.commands;

import contracts.ContentComparer;
import contracts.Database;
import contracts.DirectoryManager;
import contracts.Downloader;
import exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class MakeDirectoryCommand extends Command {

    public MakeDirectoryCommand(String line, String[] data, DirectoryManager ioManager, ContentComparer tester, Downloader downloadManager,
                                Database studentsRepository) {
        super(line, data, ioManager, tester, downloadManager, studentsRepository);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2) {
            throw new InvalidInputException(this.getLine());
        }
        this.getIoManager().createDirectoryInCurrentFolder(data[1]);
    }
}
