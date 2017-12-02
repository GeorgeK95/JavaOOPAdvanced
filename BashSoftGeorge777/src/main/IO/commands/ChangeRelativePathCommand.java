package main.IO.commands;

import main.annotations.Alias;
import main.annotations.Inject;
import main.contracts.DirectoryManager;
import main.exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Alias(value = "changeDirRel")
public class ChangeRelativePathCommand extends Command {
    @Inject
    private DirectoryManager iomanager;

    public ChangeRelativePathCommand(String line, String[] data) {
        super(line, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2) {
            throw new InvalidInputException(this.getLine());
        }
        this.iomanager.changeCurrentDirRelativePath(data[1]);
    }
}
