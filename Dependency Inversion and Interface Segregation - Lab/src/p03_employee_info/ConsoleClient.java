package p03_employee_info;

import p01_system_resources.contracts.Writer;
import p01_system_resources.implementations.ConsoleOutputWriter;
import p03_employee_info.contracts.Database;
import p03_employee_info.contracts.Formatter;
import p03_employee_info.contracts.InfoProvider;
import p03_employee_info.models.ConsoleFormatter;
import p03_employee_info.models.EmployeeDatabase;
import p03_employee_info.models.EmployeeInfoProvider;

public class ConsoleClient {

    public static void main(String[] args) {
        Database database = new EmployeeDatabase();
        InfoProvider employeeInfo = new EmployeeInfoProvider(database);
        Formatter formatter = new ConsoleFormatter();
        String output = formatter.format(employeeInfo.getByName());
        Writer writer = new ConsoleOutputWriter();
        writer.writeLine(output);
    }
}
