package app.commands;


import app.manager.Manager;
import app.waste_disposal.annotations.InjectArgs;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class ChangeManagementRequirementCommand extends BaseCommand {
    @InjectArgs
    private String[] params;

    public ChangeManagementRequirementCommand(Manager manager) {
        super(manager);
    }

    @Override
    public String execute() {
        return super.getManager().changeManagementRequirement(Double.parseDouble(params[1]), Double.parseDouble(params[2]), params[3]);
    }
}
