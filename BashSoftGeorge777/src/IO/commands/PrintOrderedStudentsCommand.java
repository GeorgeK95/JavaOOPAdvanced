package IO.commands;

import annotations.Alias;
import annotations.Inject;
import contracts.Database;
import contracts.OrderedTaker;
import exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Alias(value = "order")
public class PrintOrderedStudentsCommand extends Command {
    @Inject
    private Database studentsRepository;

    public PrintOrderedStudentsCommand(String line, String[] data) {
        super(line, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 3 && data.length != 4) {
            throw new InvalidInputException(this.getLine());
        }

        //problems might occur here
        if (data.length == 3) {
            ((OrderedTaker) this.studentsRepository).orderAndTake(data[1], data[2]);
        }
        if (data.length == 4) {
            ((OrderedTaker) this.studentsRepository).orderAndTake(data[1], data[2], Integer.parseInt(data[3]));
        }
    }
}
