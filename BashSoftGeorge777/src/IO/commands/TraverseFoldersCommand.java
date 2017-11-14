package IO.commands;

import contracts.ContentComparer;
import contracts.Database;
import contracts.DirectoryManager;
import contracts.Downloader;
import exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class TraverseFoldersCommand extends Command {

    public TraverseFoldersCommand(String line, String[] data, DirectoryManager ioManager, ContentComparer tester, Downloader downloadManager, Database studentsRepository) {
        super(line, data, ioManager, tester, downloadManager, studentsRepository);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2 && data.length != 1) {
            throw new InvalidInputException(this.getLine());
        }
        if (data.length == 2) {
            this.getIoManager().traverseDirectory(Integer.parseInt(data[1]));
        }
        if (data.length == 1) {
            this.getIoManager().traverseDirectory(0);
        }
    }
}
