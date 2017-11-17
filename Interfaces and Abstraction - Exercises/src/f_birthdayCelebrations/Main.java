package f_birthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    private static List<Mammal> mammals = new ArrayList<>();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String line = in.nextLine();
            if ("End".equals(line)) {
                String year = in.nextLine();
                print(year);
                break;
            }
            writeData(line.split("\\s+"));
        }
    }

    private static void print(String year) {
        mammals.stream().filter(c -> c.wasBornInGivenYear(year))
                .forEach(c -> System.out.println(c.getBirthDay()));
    }

    private static void writeData(String[] data) {
        Mammal mammal = null;

        String type = data[0];
        switch (type) {
            case "Citizen":
                mammal = new Human(data[1], data[3], data[4], Integer.parseInt(data[2]));
                break;
            case "Pet":
                mammal = new Pet(data[1], data[2]);
                break;
        }

        if (mammal != null)
            mammals.add(mammal);
    }
}
