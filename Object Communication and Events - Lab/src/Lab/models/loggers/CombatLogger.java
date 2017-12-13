package Lab.models.loggers;

import Lab.enums.LogType;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class CombatLogger extends Logger {

    @Override
    public void handle(LogType type, String msg) {
        if (type == LogType.ATTACK || type == LogType.MAGIC)
            System.out.println(String.format("%s: %s", type.name(), msg));
        super.setNextLogger(type, msg);
    }
}
