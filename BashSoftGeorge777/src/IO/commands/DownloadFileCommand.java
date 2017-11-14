package IO.commands;

import contracts.*;
import exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class DownloadFileCommand extends Command {

    public DownloadFileCommand(String line, String[] data, DirectoryManager ioManager, ContentComparer tester, Downloader downloadManager, Database studentsRepository) {
        super(line, data, ioManager, tester, downloadManager, studentsRepository);

    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2) {
            throw new InvalidInputException(this.getLine());
        }
        //again cast problems ?
        ((ASynchDownloader) this.getDownloadManager()).downloadOnNewThread(data[1]);
    }
}
