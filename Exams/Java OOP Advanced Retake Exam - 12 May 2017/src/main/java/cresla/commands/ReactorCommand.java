package cresla.commands;

import cresla.annotations.InjectArgs;
import cresla.interfaces.Manager;

import java.util.Arrays;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class ReactorCommand extends BaseCommand {
    @InjectArgs
    private String[] params;

    public ReactorCommand(Manager manager) {
        super(manager);
    }

    @Override
    public String execute() {
        return super.getManager().reactorCommand(Arrays.asList(this.params));
    }
}
