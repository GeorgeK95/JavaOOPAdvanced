package b_KingsGambit;

import b_KingsGambit.engines.Engine;
import b_KingsGambit.utilities.InputParser;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        InputParser parser = new InputParser();
        Runnable engine = new Engine(parser);
        engine.run();
    }
}
