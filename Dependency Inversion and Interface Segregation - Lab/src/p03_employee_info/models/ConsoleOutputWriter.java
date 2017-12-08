package p03_employee_info.models;

import p03_employee_info.contracts.Writer;

public class ConsoleOutputWriter implements Writer {
    @Override
    public void writeLine(String output) {
        System.out.println(output);
    }
}