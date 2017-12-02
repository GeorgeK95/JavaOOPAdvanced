package main.contracts;

import java.io.IOException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface Interpreter {
    void interpretCommand(String input) throws IOException;
}
