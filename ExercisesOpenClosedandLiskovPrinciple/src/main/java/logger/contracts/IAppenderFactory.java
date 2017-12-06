package logger.contracts;

import logger.enums.ReportLevel;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface IAppenderFactory {
    Appender getAppender(String type, Layout layout, ReportLevel level);
}
