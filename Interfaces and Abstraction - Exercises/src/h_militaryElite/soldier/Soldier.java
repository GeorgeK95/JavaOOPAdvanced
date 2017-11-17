package h_militaryElite.soldier;


import h_militaryElite.interfaces.ISoldier;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public abstract class Soldier implements ISoldier {

    private int id;
    private String firstName;
    private String lastName;

    Soldier(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d", this.getFirstName(), this.getLastName(), this.getId());
    }
}
