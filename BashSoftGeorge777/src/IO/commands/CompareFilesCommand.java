package IO.commands;

import annotations.Alias;
import annotations.Inject;
import contracts.ContentComparer;
import exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Alias(value = "cmp")
public class CompareFilesCommand extends Command {

    @Inject
    private ContentComparer tester;

    public CompareFilesCommand(String line, String[] data) {
        super(line, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 3) {
            throw new InvalidInputException(this.getLine());
        }
        this.tester.compareContent(data[1], data[2]);
    }
}
