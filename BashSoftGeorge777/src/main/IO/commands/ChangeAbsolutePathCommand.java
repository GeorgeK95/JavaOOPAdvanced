package main.IO.commands;

import main.annotations.Alias;
import main.annotations.Inject;
import main.contracts.DirectoryManager;
import main.exceptions.InvalidInputException;

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
