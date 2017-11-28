package IO.commands;

import annotations.Alias;
import annotations.Inject;
import contracts.*;
import exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Alias(value = "downloadasync")
public class DownloadAsynchCommand extends Command {

    @Inject
    private ASynchDownloader aSynchDownloader;

    public DownloadAsynchCommand(String line, String[] data) {
        super(line, data);

    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2) {
            throw new InvalidInputException(this.getLine());
        }
        //there might be a problem
//        this.aSynchDownloader = (ASynchDownloader) this.getDownloadManager();
        this.aSynchDownloader.downloadOnNewThread(data[1]);
    }
}
