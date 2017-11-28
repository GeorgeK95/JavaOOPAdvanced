package IO.commands;

import annotations.Alias;
import annotations.Inject;
import contracts.DirectoryManager;
import exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Alias(value = "changeDirAbs")
public class ChangeAbsolutePathCommand extends Command {
    @Inject
    private DirectoryManager ioManager;

    public ChangeAbsolutePathCommand(String line, String[] data) {
        super(line, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2) {
            throw new InvalidInputException(this.getLine());
        }
        this.ioManager.changeCurrentDirAbsolute(data[1]);
    }
}
