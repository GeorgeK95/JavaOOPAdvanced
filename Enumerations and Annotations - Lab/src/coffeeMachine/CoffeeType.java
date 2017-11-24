package coffeeMachine;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public enum CoffeeType {
    ESPRESSO, LATTE, IRISH;

    @Override
    public String toString() {
        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }
}
