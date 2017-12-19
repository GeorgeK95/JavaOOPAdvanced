package cresla.entities.modules;

import cresla.interfaces.AbsorbingModule;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public abstract class BaseAbsorbing extends BaseModule implements AbsorbingModule {
    private int heatAbsorbing;

    protected BaseAbsorbing(int id, int heatAbsorbing) {
        super(id);
        this.heatAbsorbing = heatAbsorbing;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString())
                .append(String.format("Heat Absorbing: %d", this.getHeatAbsorbing()));
        return builder.toString();
    }

    public int getHeatAbsorbing() {
        return heatAbsorbing;
    }
}
