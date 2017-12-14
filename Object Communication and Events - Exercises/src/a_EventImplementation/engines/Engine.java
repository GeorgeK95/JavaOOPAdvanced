package a_EventImplementation.engines;

import a_EventImplementation.models.Dispatcher;

import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Engine implements Runnable {
    private Dispatcher dispatcher;
    private static final String TERMINATE_COMMAND = "End";

    public Engine(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String line = in.nextLine();
            if (TERMINATE_COMMAND.equals(line)) {
                break;
            }

            this.dispatcher.changeName(line);
        }
    }
}
