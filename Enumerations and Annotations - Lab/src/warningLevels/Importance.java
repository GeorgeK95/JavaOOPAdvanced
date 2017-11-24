package warningLevels;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public enum Importance {
    LOW, NORMAL, MEDIUM, HIGH;

    @Override
    public String toString() {
        return this.name();
    }
}
