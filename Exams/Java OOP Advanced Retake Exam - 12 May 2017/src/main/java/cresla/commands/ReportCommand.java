package cresla.commands;

import cresla.annotations.InjectArgs;
import cresla.interfaces.Manager;

import java.util.Arrays;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class ReportCommand extends BaseCommand {
    @InjectArgs
    private String params[];

    public ReportCommand(Manager manager) {
        super(manager);
    }

    @Override
    public String execute() {
        return super.getManager().reportCommand(Arrays.asList(this.params));
    }
}
