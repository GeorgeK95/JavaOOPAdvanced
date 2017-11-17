package g_foodShortage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    private static Scanner in = new Scanner(System.in);
    private static Map<String, Buyer> buyers = new HashMap<>();

    public static void main(String[] args) {
        setBuyers();
        buyFood();
    }

    private static void buyFood() {
        while (true) {
            String line = in.nextLine();
            if ("End".equals(line)) {
                print();
                break;
            }
            if (buyers.containsKey(line)) {
                buyers.get(line).buyFood();
            }
        }
    }

    private static void setBuyers() {
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            writeData(in.nextLine().split("\\s+"));
        }
    }

    private static void print() {
        System.out.println(Human.FOOD + Rebel.FOOD);
    }


    private static void writeData(String[] data) {
        Buyer buyer = null;
        switch (data.length) {
            case 4:
                buyer = new Human(data[0], data[2], data[3], Integer.parseInt(data[1]));
                break;
            case 3:
                buyer = new Rebel(data[0], Integer.parseInt(data[1]), data[2]);
                break;
        }

        if (buyer != null) buyers.put(data[0], buyer);
    }
}
