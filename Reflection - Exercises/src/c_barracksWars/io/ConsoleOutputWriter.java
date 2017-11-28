package c_barracksWars.io;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public final class ConsoleOutputWriter {
    public static void writeLine(String line) {
        if (!line.isEmpty() && !line.equals("fight")) {
            System.out.println(line);
        }
    }
}
