package cresla.engines;

import cresla.commands.Executable;
import cresla.interfaces.InputReader;
import cresla.interfaces.OutputWriter;
import cresla.interpreters.Interpreter;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Engine implements Runnable {
    private static final String INPUT_TERMINATING_COMMAND = "Exit";
    private InputReader inputReader;
    private OutputWriter outputWriter;
    private Interpreter interpreter;

    public Engine(InputReader inputReader, OutputWriter outputWriter, Interpreter interpreter) {
        this.inputReader = inputReader;
        this.outputWriter = outputWriter;
        this.interpreter = interpreter;
    }

    @Override
    public void run() {
        String line = inputReader.readLine();
        while (true) {
            try {
                Executable executable = this.interpreter.interpretCommand(line);
                String executeResult = executable.execute();
                this.outputWriter.writeLine(executeResult);
                if (INPUT_TERMINATING_COMMAND.equals(line)) break;
                line = inputReader.readLine();
            } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
