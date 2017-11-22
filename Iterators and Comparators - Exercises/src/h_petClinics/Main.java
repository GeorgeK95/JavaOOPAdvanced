package h_petClinics;

import h_petClinics.engines.PetEngine;
import h_petClinics.io.ConsoleInputReader;
import h_petClinics.io.ConsoleOutputWriter;
import h_petClinics.manager.ClinicManager;
import h_petClinics.utilities.InputParser;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        ConsoleInputReader inputReader = new ConsoleInputReader();
        ConsoleOutputWriter outputWriter = new ConsoleOutputWriter();
        InputParser inputParser = new InputParser();
        ClinicManager gameManager = new ClinicManager();
        PetEngine engine = new PetEngine(inputReader, outputWriter, inputParser, gameManager);
        engine.run();
    }
}
