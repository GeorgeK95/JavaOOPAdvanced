package cresla.entities.modules;

import cresla.interfaces.EnergyModule;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public abstract class BaseEnergy extends BaseModule implements EnergyModule {
    private int energyOutput;

    protected BaseEnergy(int id, int energyOutput) {
        super(id);
        this.energyOutput = energyOutput;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString())
                .append(String.format("Energy Output: %d", this.getEnergyOutput()));
        return builder.toString();
    }

    public int getEnergyOutput() {
        return energyOutput;
    }
}
