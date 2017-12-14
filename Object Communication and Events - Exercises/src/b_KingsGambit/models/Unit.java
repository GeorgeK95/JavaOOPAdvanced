package b_KingsGambit.models;

import b_KingsGambit.contracts.Killable;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public abstract class Unit implements Killable {
    private String name;
    protected boolean isDead;

    public Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
