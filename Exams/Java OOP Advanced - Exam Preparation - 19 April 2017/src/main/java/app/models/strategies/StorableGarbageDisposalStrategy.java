package app.models.strategies;

import app.models.data.ProcessingDataImpl;
import app.waste_disposal.contracts.GarbageDisposalStrategy;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.Waste;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class StorableGarbageDisposalStrategy implements GarbageDisposalStrategy {

    private static final double ENERGY_MULTIPLIER = 13.0 / 100.0;
    private static final double CAPITAL_MULTIPLIER = 65.0 / 100.0;

    @Override
    public ProcessingData processGarbage(Waste garbage) {
        double volume = garbage.getVolumePerKg() * garbage.getWeight();
        double energyBalance = -1 * volume * 0.13;
        double capitalBalance = -1 * volume * 0.65;

        return new ProcessingDataImpl(energyBalance, capitalBalance);
       /* double totalGarbageVolume = garbage.getVolumePerKg() * garbage.getWeight();
        double energy = ENERGY_MULTIPLIER * totalGarbageVolume * -1;
        double capital = CAPITAL_MULTIPLIER * totalGarbageVolume * -1;

        return new ProcessingDataImpl(energy, capital);*/
    }
}
