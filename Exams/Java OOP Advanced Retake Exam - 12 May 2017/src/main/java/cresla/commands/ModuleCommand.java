package cresla.commands;

import cresla.annotations.InjectArgs;
import cresla.interfaces.Manager;

import java.util.Arrays;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class ModuleCommand extends BaseCommand {
    @InjectArgs
    private String[] params;

    public ModuleCommand(Manager manager) {
        super(manager);
    }

    @Override
    public String execute() {
        return super.getManager().moduleCommand(Arrays.asList(this.params));
    }
}
