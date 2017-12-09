package boatRacingSimulator.contracts;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface IEngine extends IModelable {
    int getHorsepower();

    int getDisplacement();

    int getOutput();

    int getCachedOutput();
}
