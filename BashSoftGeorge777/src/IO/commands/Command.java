package IO.commands;

import contracts.*;
import exceptions.InvalidCommandException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public abstract class Command implements Executable {
    private String line;
    private String[] data;
    private DirectoryManager ioManager;
    private ContentComparer tester;
    private Downloader downloadManager;
    private Database studentsRepository;

    public Command(String line, String[] data, DirectoryManager ioManager, ContentComparer tester, Downloader downloadManager, Database studentsRepository) {
        this.setLine(line);
        this.setData(data);
        this.setIoManager(ioManager);
        this.setTester(tester);
        this.setDownloadManager(downloadManager);
        this.setStudentsRepository(studentsRepository);
    }

    public abstract void execute() throws Exception;

    protected String getLine() {
        return line;
    }

    private void setLine(String line) {
        if (line == null || line.equals("")) {
            throw new InvalidCommandException(line);
        }
        this.line = line;
    }

    protected String[] getData() {
        return data;
    }

    private void setData(String[] data) {
        if (data == null || data.length < 1) {
            throw new InvalidCommandException(line);
        }
        this.data = data;
    }

    protected DirectoryManager getIoManager() {
        return ioManager;
    }

    private void setIoManager(DirectoryManager ioManager) {
        this.ioManager = ioManager;
    }

    protected ContentComparer getTester() {
        return tester;
    }

    private void setTester(ContentComparer tester) {
        this.tester = tester;
    }

    protected Downloader getDownloadManager() {
        return downloadManager;
    }

    private void setDownloadManager(Downloader downloadManager) {
        this.downloadManager = downloadManager;
    }

    protected Database getStudentsRepository() {
        return studentsRepository;
    }

    private void setStudentsRepository(Database studentsRepository) {
        this.studentsRepository = studentsRepository;
    }
}
