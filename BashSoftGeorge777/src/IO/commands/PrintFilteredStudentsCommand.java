package IO.commands;

import annotations.Alias;
import annotations.Inject;
import contracts.*;
import exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Alias(value = "filter")
public class PrintFilteredStudentsCommand extends Command {
    @Inject
    private Database studentsRepository;

    public PrintFilteredStudentsCommand(String line, String[] data) {
        super(line, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 3 && data.length != 4) {
            throw new InvalidInputException(this.getLine());
        }
        //cast problems ?
        if (data.length == 3) {
            ((FilteredTaker) this.studentsRepository).filterAndTake(data[1], data[2]);
        }
        if (data.length == 4) {
            ((FilteredTaker) this.studentsRepository).filterAndTake(data[1], data[2], Integer.parseInt(data[3]));
        }
    }
}
