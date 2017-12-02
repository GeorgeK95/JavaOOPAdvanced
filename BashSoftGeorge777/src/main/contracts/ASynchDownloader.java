package main.contracts;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface ASynchDownloader extends Downloader {
    void downloadOnNewThread(String fileLink);

}
