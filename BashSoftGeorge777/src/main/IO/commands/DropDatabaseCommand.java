package main.IO.commands;

import main.IO.OutputWriter;
import main.annotations.Alias;
import main.annotations.Inject;
import main.contracts.Database;
import main.exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Alias(value = "dropdb")
public class DropDatabaseCommand extends Command {

    @Inject
    private Database studentsRepository;

    public DropDatabaseCommand(String line, String[] data) {
        super(line, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 1) {
            throw new InvalidInputException(this.getLine());
        }
        this.studentsRepository.unloadData();
        OutputWriter.writeMessageOnNewLine("Database dropped.");
    }
}
