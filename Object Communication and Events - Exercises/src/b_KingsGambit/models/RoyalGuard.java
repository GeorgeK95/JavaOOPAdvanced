package b_KingsGambit.models;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class RoyalGuard extends Unit {

    private static final String ROYAL_GUARD_S_IS_DEFENDING = "Royal Guard %s is defending!";

    public RoyalGuard(String name) {
        super(name);
    }

    @Override
    public void kill() {
        this.isDead = true;
    }

    @Override
    public String toString() {
        return String.format(ROYAL_GUARD_S_IS_DEFENDING, super.getName());
    }
}
