package IO.commands;

import contracts.*;
import exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class DownloadAsynchCommand extends Command {

    public DownloadAsynchCommand(String line, String[] data, DirectoryManager ioManager, ContentComparer tester, Downloader downloadManager, Database studentsRepository) {
        super(line, data, ioManager, tester, downloadManager, studentsRepository);

    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2) {
            throw new InvalidInputException(this.getLine());
        }
        //there might be a problem
        ASynchDownloader downloadManager = (ASynchDownloader) this.getDownloadManager();
        downloadManager.downloadOnNewThread(data[1]);
    }
}
