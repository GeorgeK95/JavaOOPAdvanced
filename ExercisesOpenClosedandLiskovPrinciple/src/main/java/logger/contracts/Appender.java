package logger.contracts;

import logger.enums.ReportLevel;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface Appender {
    ReportLevel DEFAULT_REPORT_LEVEL = ReportLevel.INFO;


    void setReportLevel(ReportLevel level);

    void appendMessage(ReportLevel error, String dateAndTime, String message);

    ReportLevel getLevel();

    Layout getLayout();
}
