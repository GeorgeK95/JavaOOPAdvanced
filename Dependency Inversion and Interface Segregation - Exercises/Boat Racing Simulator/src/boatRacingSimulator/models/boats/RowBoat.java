package boatRacingSimulator.models.boats;

import boatRacingSimulator.Utility.Validator;
import boatRacingSimulator.contracts.IRace;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class RowBoat extends BaseBoat {
    private int oars;

    public RowBoat(String model, int weight, int oars) {
        super(model, weight);
        this.setOars(oars);
    }

    private int getOars() {
        return oars;
    }

    private void setOars(int oars) {
        Validator.ValidatePropertyValue(oars, "Oars");
        this.oars = oars;
    }

    @Override
    public double CalculateRaceSpeed(IRace race) {
        return (this.getOars() * 100.0) - super.getWeight() + race.getOceanCurrentSpeed();
    }

    @Override
    public boolean hasEngine() {
        return false;
    }
}
