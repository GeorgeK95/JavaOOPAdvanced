package hell.commands;

import hell.annotations.InjectArgs;
import hell.repository.Repository;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class InspectCommand extends BaseCommand {
    @InjectArgs
    private String[] params;

    public InspectCommand(Repository repository) {
        super(repository);
    }

    @Override
    public String execute() throws IllegalAccessException {
        return super.getManager().inspectCommand(params[1]);
    }
}
