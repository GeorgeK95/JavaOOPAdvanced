package c_barracksWars.core.commands;

import c_barracksWars.contracts.Repository;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Report extends Command {
    private Repository repository;

    public Report(String[] data, Repository repository) {
        super(data);
        this.repository = repository;
    }

    @Override
    public String execute() {
        return this.repository.getStatistics();
    }
}
