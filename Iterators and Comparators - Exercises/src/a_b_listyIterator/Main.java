package a_b_listyIterator;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();
        CommandExecutor executor = new CommandExecutor();

        while (!command.equals("END")) {
            String execCommand = command.split("\\s+")[0];
            switch (execCommand) {
                case "Create":
                    executor.executeCreateCommand(Arrays.copyOfRange(command.split("\\s+"), 1, command.split("\\s+").length));
                    break;
                case "Move":
                    executor.executeMoveCommand();
                    break;
                case "HasNext":
                    executor.executeHasNextCommand();
                    break;
                case "Print":
                    executor.executePrintCommand();
                    break;
                case "PrintAll":
                    executor.executePrintAllCommand();
                    break;
            }
            command = in.nextLine();
        }
    }
}
