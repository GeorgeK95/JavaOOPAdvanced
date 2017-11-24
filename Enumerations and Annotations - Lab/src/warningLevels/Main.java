package warningLevels;

import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    private static Logger logger;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        logger = new Logger(in.nextLine());

        while (true) {
            String line = in.nextLine();
            if ("END".equals(line)) {
                print();
                break;
            }

            writeData(line.split(": "));
        }
    }

    private static void print() {
        logger.getMessages().forEach(System.out::println);
    }

    private static void writeData(String[] split) {
        logger.addMessage(new Message(split[0], split[1]));
    }
}
