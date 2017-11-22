package c_stack;

import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();
        CommandExecutor executor = new CommandExecutor();

        while (!"END".equals(command)) {
            String executeCommand = command.split("\\s+")[0];
            switch (executeCommand) {
                case "Push":
                    executor.push(command);
                    break;
                case "Pop":
                    executor.pop();
                    break;
            }
            command = in.nextLine();
        }
        executor.print();
    }

}
