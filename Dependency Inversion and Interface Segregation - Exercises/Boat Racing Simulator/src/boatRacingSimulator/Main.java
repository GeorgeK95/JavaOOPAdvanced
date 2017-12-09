package boatRacingSimulator;

import boatRacingSimulator.Core.CommandHandler;
import boatRacingSimulator.Core.Engine;
import boatRacingSimulator.contracts.IBoatSimulatorController;
import boatRacingSimulator.contracts.IDatabase;
import boatRacingSimulator.controllers.BoatSimulatorController;
import boatRacingSimulator.database.BoatSimulatorDatabase;

public class Main {
    public static void main(String[] args) {
        IDatabase db = new BoatSimulatorDatabase();
        IBoatSimulatorController ctrl = new BoatSimulatorController(db);
        CommandHandler commandHandler = new CommandHandler(ctrl);
        Engine engine = new Engine(commandHandler);
        engine.run();
    }
}
