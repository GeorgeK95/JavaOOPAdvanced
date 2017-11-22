package i_linkedListTraversial.engine;

import i_linkedListTraversial.manager.Manager;

import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class CommandInterpreter {
    private Manager manager;

    public CommandInterpreter() {
        this.manager = new Manager();
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = in.nextLine().split("\\s+");
            this.executeCommand(data[0], Integer.parseInt(data[1]));
        }

        this.manager.printResult();
    }

    private void executeCommand(String command, int element) {
        switch (command) {
            case "Add":
                this.manager.executeAddCommand(element);
                break;
            case "Remove":
                this.manager.executeRemoveCommand(element);
                break;
        }
    }

}
