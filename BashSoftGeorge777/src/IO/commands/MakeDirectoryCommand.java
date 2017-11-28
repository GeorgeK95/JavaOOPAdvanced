package IO.commands;

import annotations.Alias;
import annotations.Inject;
import contracts.DirectoryManager;
import exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Alias(value = "mkdir")
public class MakeDirectoryCommand extends Command {
    @Inject
    private DirectoryManager iomanager;

    public MakeDirectoryCommand(String line, String[] data) {
        super(line, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2) {
            throw new InvalidInputException(this.getLine());
        }
        this.iomanager.createDirectoryInCurrentFolder(data[1]);
    }
}
