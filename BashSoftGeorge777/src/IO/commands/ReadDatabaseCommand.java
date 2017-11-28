package IO.commands;

import annotations.Alias;
import annotations.Inject;
import contracts.Database;
import exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Alias(value = "readdb")
public class ReadDatabaseCommand extends Command {
    @Inject
    private Database studentsRepository;

    public ReadDatabaseCommand(String line, String[] data) {
        super(line, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2) {
            throw new InvalidInputException(this.getLine());
        }
        this.studentsRepository.loadData(data[1]);
    }
}
