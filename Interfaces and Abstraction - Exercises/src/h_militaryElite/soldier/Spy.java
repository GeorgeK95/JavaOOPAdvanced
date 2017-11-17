package h_militaryElite.soldier;


import h_militaryElite.interfaces.ISpy;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Spy extends Soldier implements ISpy {
    private String codeNumber;

    public Spy(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String getCodeNumber() {
        return this.codeNumber;
    }

    @Override
    public String toString() {
        return super.toString().concat(String.format("\nCode Number: %s", this.getCodeNumber()));
    }
}
