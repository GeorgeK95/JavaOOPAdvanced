package app.models.strategies;

import app.models.data.ProcessingDataImpl;
import app.waste_disposal.contracts.GarbageDisposalStrategy;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class BurnableGarbageDisposalStrategy implements GarbageDisposalStrategy {

    private static final double ENERGY_MULTIPLIER = (100.0 - 20.0) / 100.0;

    @Override
    public ProcessingData processGarbage(Waste garbage) {
        double volume = garbage.getVolumePerKg() * garbage.getWeight();
        double energyBalance = volume * 0.8;
        double capitalBalance = 0.0;

        return new ProcessingDataImpl(energyBalance, capitalBalance);
       /* double totalGarbageVolume = garbage.getVolumePerKg() * garbage.getWeight();
        double energy = ENERGY_MULTIPLIER * totalGarbageVolume;

        return new ProcessingDataImpl(energy, 0D);*/
    }
}
