package Lab.contracts;

import Lab.enums.LogType;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface Handler {
    void handle(LogType type, String msg);

    void setSuccessor(Handler handler);
}
