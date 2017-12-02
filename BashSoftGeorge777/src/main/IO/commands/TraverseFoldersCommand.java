package main.IO.commands;

import main.annotations.Alias;
import main.annotations.Inject;
import main.contracts.DirectoryManager;
import main.exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Alias(value = "traverse")
public class TraverseFoldersCommand extends Command {
    @Inject
    private DirectoryManager iomanager;

    public TraverseFoldersCommand(String line, String[] data) {
        super(line, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2 && data.length != 1) {
            throw new InvalidInputException(this.getLine());
        }
        if (data.length == 2) {
            this.iomanager.traverseDirectory(Integer.parseInt(data[1]));
        }
        if (data.length == 1) {
            this.iomanager.traverseDirectory(0);
        }
    }
}
