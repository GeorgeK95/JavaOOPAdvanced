package c_barracksWars.core.commands;

import c_barracksWars.annotation.Alias;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Alias(value = "fight")
public class Fight extends Command {

    public Fight(String helperParam, String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
