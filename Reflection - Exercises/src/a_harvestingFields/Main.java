package a_harvestingFields;

import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    private static final String TERMINATE_COMMAND = "HARVEST";

    public static void main(String[] args) {
        ICommandExecutor executor = new CommandExecutor();
        Scanner in = new Scanner(System.in);
        String command = in.nextLine();

        while (!command.equals(TERMINATE_COMMAND)) {
            executor.execute(command);
            command = in.nextLine();
        }
    }
}
