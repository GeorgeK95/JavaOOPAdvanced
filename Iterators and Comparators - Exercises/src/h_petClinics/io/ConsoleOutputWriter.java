package h_petClinics.io;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class ConsoleOutputWriter {
    public void writeLine(String output) {
        if (!output.isEmpty())
            System.out.println(output);
    }

    public void writeLine(boolean output) {
        System.out.println(output);
    }
}
