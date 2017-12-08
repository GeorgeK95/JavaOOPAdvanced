package p01_system_resources.implementations;

import p01_system_resources.contracts.Writer;

public class ConsoleOutputWriter implements Writer {
    @Override
    public void writeLine(String output) {
        System.out.println(output);
    }
}