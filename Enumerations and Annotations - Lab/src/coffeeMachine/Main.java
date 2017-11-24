package coffeeMachine;

import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    private static final String SEPARATOR = " ";

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        while (!line.equals("END")) {
            performOperation(machine, line.split(SEPARATOR));
            line = in.nextLine();
        }

        print(machine);
    }

    private static void print(CoffeeMachine machine) {
        for (Coffee coffee : machine.getCoffees()) {
            System.out.println(coffee);
        }
    }

    private static void performOperation(CoffeeMachine machine, String[] line) {
        switch (line.length) {
            case 1:
                machine.insertCoin(line[0]);
                break;
            case 2:
                machine.buyCoffee(line[0], line[1]);
                break;
        }
    }
}
