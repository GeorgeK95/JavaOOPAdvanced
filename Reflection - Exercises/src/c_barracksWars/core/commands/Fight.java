package c_barracksWars.core.commands;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Fight extends Command {

    public Fight(String[] data) {
        super(data);
    }

    @Override
    public String execute() {
        return "fight";
    }
}
