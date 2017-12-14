package b_KingsGambit.engines;

import b_KingsGambit.core.Kingdom;
import b_KingsGambit.utilities.InputParser;

import java.util.List;
import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Engine implements Runnable {

    private static final String TERMINATE_COMMAND = "End";
    private static final String ATTACK_COMMAND = "Attack";
    private static final String KILL_COMMAND = "Kill";
    private InputParser parser;
    private Kingdom kingdom;

    public Engine(InputParser parser) {
        this.parser = parser;
    }

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        String kingName = in.nextLine();
        List<String> guardNames = this.parser.parseInput(in.nextLine());
        List<String> footmanNames = this.parser.parseInput(in.nextLine());

        this.kingdom = new Kingdom(kingName, guardNames, footmanNames);

        while (true) {
            String line = in.nextLine();
            if (TERMINATE_COMMAND.equals(line)) {
                break;
            }

            this.dispatchCommand(line);
        }
    }

    private void dispatchCommand(String line) {
        List<String> strings = this.parser.parseInput(line);
        String command = strings.get(0);
        String name = strings.get(1);

        if (command.startsWith(ATTACK_COMMAND)) {
            this.kingdom.respondToAttack();
        } else if (command.startsWith(KILL_COMMAND)) {
            this.kingdom.killUnit(name);
        }

    }
}
