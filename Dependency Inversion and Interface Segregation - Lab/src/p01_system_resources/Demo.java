package p01_system_resources;

import p01_system_resources.implementations.ConsoleOutputWriter;
import p01_system_resources.implementations.CurrentTime;
import p01_system_resources.models.GreetingClock;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Demo {
    public static void main(String[] args) {
        GreetingClock clock = new GreetingClock(new CurrentTime(), new ConsoleOutputWriter());
        clock.greeting();
    }
}
