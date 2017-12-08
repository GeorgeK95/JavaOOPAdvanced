package p03_employee_info.models;

import p03_employee_info.contracts.Formatter;
import p03_employee_info.contracts.Human;

public class ConsoleFormatter implements Formatter{

    @Override
    public String format(Iterable<Human> employees) {
        StringBuilder sb = new StringBuilder();
        for (Human employee : employees) {
            sb.append(employee).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
