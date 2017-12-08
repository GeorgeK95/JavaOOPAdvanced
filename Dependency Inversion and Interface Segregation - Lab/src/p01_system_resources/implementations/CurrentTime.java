package p01_system_resources.implementations;

import p01_system_resources.contracts.TimeProvider;

import java.time.LocalTime;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class CurrentTime implements TimeProvider {

    @Override
    public int getHour() {
        return LocalTime.now().getHour();
    }
}
