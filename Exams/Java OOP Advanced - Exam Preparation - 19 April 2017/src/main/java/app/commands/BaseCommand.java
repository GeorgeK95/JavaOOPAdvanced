package app.commands;


import app.manager.Manager;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public abstract class BaseCommand implements Executable {

    private Manager manager;

    protected BaseCommand(Manager manager) {
        this.manager = manager;
    }

    protected Manager getManager() {
        return manager;
    }
}
