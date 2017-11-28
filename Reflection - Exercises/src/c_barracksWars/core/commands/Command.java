package c_barracksWars.core.commands;

import c_barracksWars.contracts.*;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
abstract class Command implements Executable {
    private String[] data;

    Command(String[] data) {
        this.data = data;
    }

    String[] getData() {
        return data;
    }
}
