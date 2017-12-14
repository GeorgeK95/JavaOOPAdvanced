package a_EventImplementation;

import a_EventImplementation.engines.Engine;
import a_EventImplementation.models.Dispatcher;
import a_EventImplementation.models.Handler;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher("initial");
        Handler handler = new Handler();
        dispatcher.addNameChangeListener(handler);

        Engine engine = new Engine(dispatcher);
        engine.run();
    }
}
