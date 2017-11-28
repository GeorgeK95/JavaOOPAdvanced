package c_barracksWars.core.commands;

import c_barracksWars.contracts.Repository;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Retire extends Command {
    private Repository repository;

    public Retire(String[] data, Repository repository) {
        super(data);
        this.repository = repository;
    }

    @Override
    public String execute() {
        this.repository.removeUnit(super.getData()[1]);
        return "";
    }
}
