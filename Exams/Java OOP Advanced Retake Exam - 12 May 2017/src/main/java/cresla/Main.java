package cresla;

import cresla.engines.Engine;
import cresla.interfaces.InputReader;
import cresla.interfaces.Manager;
import cresla.interfaces.OutputWriter;
import cresla.interpreters.CommandInterpreter;
import cresla.interpreters.Interpreter;
import cresla.io.ConsoleInputReader;
import cresla.io.ConsoleOutputWriter;
import cresla.manager.BusinessManager;

public class Main {
    public static void main(String[] args) {
        InputReader reader = new ConsoleInputReader();
        OutputWriter writer = new ConsoleOutputWriter();
        Manager system = new BusinessManager();
        Interpreter interpreter = new CommandInterpreter(system);
        Runnable runnable = new Engine(reader, writer, interpreter);

        runnable.run();
    }
}
