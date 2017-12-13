package Lab.models.commands;

import Lab.contracts.Command;
import Lab.contracts.Executor;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class CommandExecutor implements Executor {

    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}
