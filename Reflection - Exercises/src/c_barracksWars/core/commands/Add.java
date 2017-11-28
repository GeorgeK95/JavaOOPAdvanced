package c_barracksWars.core.commands;

import c_barracksWars.contracts.Repository;
import c_barracksWars.contracts.Unit;
import c_barracksWars.contracts.UnitFactory;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Add extends Command {
    private Repository repository;
    private UnitFactory unitFactory;

    public Add(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data);
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    @Override
    public String execute() {
        String unitType = super.getData()[1];
        Unit createdUnit = this.unitFactory.createUnit(unitType);
        this.repository.addUnit(createdUnit);
        return unitType + " added!";
    }
}
