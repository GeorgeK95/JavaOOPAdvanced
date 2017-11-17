package h_militaryElite.soldier.specialized;


import h_militaryElite.interfaces.ISpecialisedSoldier;
import h_militaryElite.soldier.Private;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class SpecialisedSoldier extends Private implements ISpecialisedSoldier {
    private String corps;

    SpecialisedSoldier(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    private void setCorps(String corps) {
        if (!corps.equals("Airforces") && !corps.equals("Marines")) {
            throw new IllegalArgumentException("Invalid corps.");
        }
        this.corps = corps;
    }

    @Override
    public String getCorps() {
        return this.corps;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nCorps: %s", this.corps);
    }
}
