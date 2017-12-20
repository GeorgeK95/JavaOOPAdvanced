package app.io;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface OutputWriter {
    void writeLine(String output);

    void writeLine(String format, Object... params);
}
