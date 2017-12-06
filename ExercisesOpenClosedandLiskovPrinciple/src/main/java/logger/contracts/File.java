package logger.contracts;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface File {
    void write(String formattedMessage);

    long getSize();
}
