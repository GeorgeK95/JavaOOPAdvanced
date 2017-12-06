package blobs.run;

import blobs.core.GameManager;
import blobs.engine.Engine;
import blobs.io.ConsoleInputReader;
import blobs.io.ConsoleOutputWriter;
import blobs.utilities.InputParser;

import java.util.LinkedHashMap;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        ConsoleInputReader inputReader = new ConsoleInputReader();
        ConsoleOutputWriter outputWriter = new ConsoleOutputWriter();
        InputParser inputParser = new InputParser();
        GameManager gameManager = new GameManager(new LinkedHashMap<>());
        Engine engine = new Engine(inputReader, outputWriter, inputParser, gameManager);

        engine.run();
    }
}
