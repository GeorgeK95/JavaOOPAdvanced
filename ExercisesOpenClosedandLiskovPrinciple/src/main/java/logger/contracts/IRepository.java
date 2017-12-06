package logger.contracts;

import logger.enums.ReportLevel;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface IRepository {
    void initializeLogger(Appender... appenders);

    void putMessageInLogger(ReportLevel level, String dateAndTime, String msg);

    void print();
}
