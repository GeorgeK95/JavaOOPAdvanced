package Lab.models.loggers;

import Lab.contracts.Handler;
import Lab.enums.LogType;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public abstract class Logger implements Handler {
    private Handler handler;

    void setNextLogger(LogType type, String msg) {
        if (this.handler != null) {
            this.handler.handle(type, msg);
        }
    }

    @Override
    public void setSuccessor(Handler handler) {
        this.handler = handler;
    }
}
