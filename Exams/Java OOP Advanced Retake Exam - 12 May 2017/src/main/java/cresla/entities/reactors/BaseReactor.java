package cresla.entities.reactors;

import cresla.entities.containers.ModuleContainer;
import cresla.interfaces.*;

import java.lang.reflect.Field;
import java.util.LinkedList;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public abstract class BaseReactor implements Reactor {
    private int id;
    private Container container;

    protected BaseReactor(Container container, int id) {
        this.container = container;
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder()
                .append(String.format("%s - %d", this.getClass().getSimpleName(), this.getId())).append(System.lineSeparator())
                .append(String.format("Energy Output: %d", this.getTotalEnergyOutput())).append(System.lineSeparator())
                .append(String.format("Heat Absorbing: %d", this.getTotalHeatAbsorbing())).append(System.lineSeparator())
                .append(String.format("Modules: %d", this.getModuleCount()));
        return builder.toString();
    }

    @Override
    public abstract long getTotalEnergyOutput();

    @Override
    public abstract long getTotalHeatAbsorbing();

    protected Container getContainer() {
        return container;
    }

    @Override
    public int getModuleCount() {
        try {
            Field field = ModuleContainer.class.getDeclaredFields()[1];
            field.setAccessible(true);
            return ((LinkedList<Module>) field.get(this.container)).size();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void addEnergyModule(EnergyModule energyModule) {
        this.container.addEnergyModule(energyModule);
    }

    @Override
    public void addAbsorbingModule(AbsorbingModule absorbingModule) {
        this.container.addAbsorbingModule(absorbingModule);
    }
}
