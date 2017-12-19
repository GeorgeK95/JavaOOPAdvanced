package hell.commands;

import hell.repository.Repository;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class QuitCommand extends BaseCommand {

    public QuitCommand(Repository repository) {
        super(repository);
    }

    @Override
    public String execute() throws IllegalAccessException {
        return super.getManager().quitCommand();
    }

}
