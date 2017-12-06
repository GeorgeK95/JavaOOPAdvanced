package P02_FileStream;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public abstract class BaseFile {
    private int length;
    private int bytesSent;

    public BaseFile(int length, int bytesSent) {
        this.length = length;
        this.bytesSent = bytesSent;
    }

    public int getLength() {
        return length;
    }

    public int getBytesSent() {
        return bytesSent;
    }
}
