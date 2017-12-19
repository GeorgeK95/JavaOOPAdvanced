package cresla.entities.reactors;

import cresla.interfaces.Container;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class HeatReactor extends BaseReactor {

    private int heatReductionIndex;

    public HeatReactor(Container container, int heatReductionIndex, int id) {
        super(container, id);
        this.heatReductionIndex = heatReductionIndex;
    }

    @Override
    public long getTotalEnergyOutput() {
        long energyOutput = super.getContainer().getTotalEnergyOutput();
        if (energyOutput > this.getTotalHeatAbsorbing()) {
            return 0;
        }
        return energyOutput;
    }

    @Override
    public long getTotalHeatAbsorbing() {
        return this.getContainer().getTotalHeatAbsorbing() + this.heatReductionIndex;
    }

    public int getHeatReductionIndex() {
        return heatReductionIndex;
    }
}
