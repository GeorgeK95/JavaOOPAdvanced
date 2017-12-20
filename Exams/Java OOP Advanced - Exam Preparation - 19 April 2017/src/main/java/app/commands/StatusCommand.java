package app.commands;


import app.manager.Manager;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class StatusCommand extends BaseCommand {

    public StatusCommand(Manager manager) {
        super(manager);
    }

    @Override
    public String execute() {
        return super.getManager().statusCommand();
    }
}
