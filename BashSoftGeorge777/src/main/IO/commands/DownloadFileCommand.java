package main.IO.commands;

import main.annotations.Alias;
import main.annotations.Inject;
import main.contracts.*;
import main.exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Alias(value = "download")
public class DownloadFileCommand extends Command {
    @Inject
    private Downloader downloader;

    public DownloadFileCommand(String line, String[] data) {
        super(line, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2) {
            throw new InvalidInputException(this.getLine());
        }
        //again cast problems ?
        ((ASynchDownloader) this.downloader).downloadOnNewThread(data[1]);
    }
}
