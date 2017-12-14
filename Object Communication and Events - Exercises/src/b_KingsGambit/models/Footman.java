package b_KingsGambit.models;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Footman extends Unit {
    private static final String FOOTMAN_S_IS_PANICKING = "Footman %s is panicking!";

    public Footman(String name) {
        super(name);
    }

    @Override
    public void kill() {
        this.isDead = true;
    }

    @Override
    public String toString() {
        return String.format(FOOTMAN_S_IS_PANICKING, super.getName());
    }
}
