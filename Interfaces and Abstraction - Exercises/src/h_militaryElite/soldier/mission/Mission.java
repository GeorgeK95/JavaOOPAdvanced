package h_militaryElite.soldier.mission;

import h_militaryElite.interfaces.IMission;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Mission implements IMission {

    private String code;
    private String state;

    public Mission(String code, String state) {
        this.code = code;
        this.setState(state);
    }

    private void setState(String state) {
        if (!state.equals("inProgress") && !state.equals("Finished")) {
            throw new IllegalArgumentException("Invalid mission state.");
        }
        this.state = state;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public void completeMission() {

    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.code, this.state);
    }
}
