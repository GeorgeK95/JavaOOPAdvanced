package boatRacingSimulator.contracts;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface IDatabase {
    IRepository<IBoat> getBoats();

    IRepository<IEngine> getEngines();
}