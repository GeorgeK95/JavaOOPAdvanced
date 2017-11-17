package c_ferrari;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Ferrari implements Car {

    private String driverName;

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",
                Car.model, this.useTheBrakes(), this.pushTheGas(), this.driverName);
    }

    @Override
    public String useTheBrakes() {
        return "Brakes!";
    }

    @Override
    public String pushTheGas() {
        return "Zadu6avam sA!";
    }
}
