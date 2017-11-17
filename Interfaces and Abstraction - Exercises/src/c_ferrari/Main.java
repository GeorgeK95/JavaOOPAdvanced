package c_ferrari;

import java.lang.instrument.IllegalClassFormatException;
import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) throws IllegalClassFormatException {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        Car ferrari = new Ferrari(name);
        System.out.println(ferrari);
       /* String ferrariName = Ferrari.class.getSimpleName();
        String carInterface = Car.class.getSimpleName();
        boolean isCreated = Car.class.isInterface();
        if (!isCreated) {
            throw new IllegalClassFormatException("No interface created!");
        }*/

    }
}
