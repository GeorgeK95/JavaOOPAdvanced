package cresla.entities.modules;

import cresla.interfaces.Module;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public abstract class BaseModule implements Module {
    private int id;

    protected BaseModule(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder()
                .append(String.format("%s Module - %d", this.getClass().getSimpleName(), this.getId())).append(System.lineSeparator());
        return builder.toString();
    }

    @Override
    public int getId() {
        return this.id;
    }

}
