package app.models.garbages;

import app.waste_disposal.contracts.Waste;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public abstract class BaseGarbage implements Waste {
    private String name;
    private double volumePerKg;
    private double weight;

    protected BaseGarbage(String name, double volumePerKg, double weight) {
        this.name = name;
        this.volumePerKg = volumePerKg;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getVolumePerKg() {
        return this.volumePerKg;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}
