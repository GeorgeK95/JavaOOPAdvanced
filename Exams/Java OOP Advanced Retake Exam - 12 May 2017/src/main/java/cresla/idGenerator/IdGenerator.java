package cresla.idGenerator;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class IdGenerator {
    private static int ID = 1;

    public static int getNextId() {
        return ID++;
    }
}
