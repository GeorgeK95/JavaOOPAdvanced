package e_borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    private static List<Entity> entities = new ArrayList<>();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String line = in.nextLine();
            if ("End".equals(line)) {
                String specifiedDigits = in.nextLine();
                print(specifiedDigits);
                break;
            }
            writeData(line.split("\\s+"));
        }
    }

    private static void print(String specifiedDigits) {
        entities.stream().filter(c -> c.isIdFake(specifiedDigits))
                .forEach(c -> System.out.println(c.getId()));
    }

    private static void writeData(String[] data) {
        Entity entity = null;
        switch (data.length) {
            case 2:
                entity = new Robot(data[0], data[1]);
                break;
            case 3:
                entity = new Human(data[0], data[2], Integer.parseInt(data[1]));
                break;
        }
        entities.add(entity);
    }
}
