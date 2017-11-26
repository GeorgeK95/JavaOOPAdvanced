package h_infernoInfinity;


import h_infernoInfinity.core.GameManager;
import h_infernoInfinity.engines.Engine;
import h_infernoInfinity.io.ConsoleOutputWriter;
import h_infernoInfinity.io.ConsoleInputReader;
import h_infernoInfinity.utilities.InputParser;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        ConsoleInputReader inputReader = new ConsoleInputReader();
        ConsoleOutputWriter outputWriter = new ConsoleOutputWriter();
        InputParser inputParser = new InputParser();
        GameManager gameManager = new GameManager();
        Engine engine = new Engine(inputReader, outputWriter, inputParser, gameManager);

        engine.run();

    }
}
