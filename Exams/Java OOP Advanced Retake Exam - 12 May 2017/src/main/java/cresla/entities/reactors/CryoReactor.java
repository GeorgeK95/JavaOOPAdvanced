package cresla.entities.reactors;

import cresla.interfaces.Container;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class CryoReactor extends BaseReactor {

    private int cryoProductionIndex;

    public CryoReactor(Container container, int cryoProductionIndex,int id) {
        super(container, id);
        this.cryoProductionIndex = cryoProductionIndex;
    }

    @Override
    public long getTotalEnergyOutput() {
        long energyOutput = super.getContainer().getTotalEnergyOutput() * this.cryoProductionIndex;
        if (energyOutput > this.getTotalHeatAbsorbing()) {
            return 0;
        }
        return energyOutput;
    }

    @Override
    public long getTotalHeatAbsorbing() {
        return super.getContainer().getTotalHeatAbsorbing();
    }

}
