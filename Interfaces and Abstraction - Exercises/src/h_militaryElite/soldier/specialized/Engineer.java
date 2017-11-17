package h_militaryElite.soldier.specialized;


import h_militaryElite.interfaces.IEngineer;
import h_militaryElite.soldier.repair.Repair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Engineer extends SpecialisedSoldier implements IEngineer {
    private List<Repair> repairs;

    public Engineer(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        builder.append(System.lineSeparator());
        builder.append("Repairs:");
        for (Repair repair : repairs) {
            builder.append(System.lineSeparator());
            builder.append("  ").append(repair);
        }
        return builder.toString();
    }

    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }
}
