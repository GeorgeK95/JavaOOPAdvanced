package IO.commands;

import StaticData.SessionData;
import contracts.ContentComparer;
import contracts.Database;
import contracts.DirectoryManager;
import contracts.Downloader;
import exceptions.InvalidInputException;

import java.io.File;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class OpenFileCommand extends Command {


    public OpenFileCommand(String line, String[] data, DirectoryManager ioManager, ContentComparer tester, Downloader downloadManager, Database studentsRepository) {
        super(line, data, ioManager, tester, downloadManager, studentsRepository);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2) {
            throw new InvalidInputException(this.getLine());
        }
        String fullFilePath = SessionData.currentPath + "\\" + data[1];
        File f = new File(fullFilePath);

    }
}
