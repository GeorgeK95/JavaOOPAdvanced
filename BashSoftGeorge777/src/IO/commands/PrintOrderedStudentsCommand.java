package IO.commands;

import contracts.*;
import exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class PrintOrderedStudentsCommand extends Command {

    public PrintOrderedStudentsCommand(String line, String[] data, DirectoryManager ioManager, ContentComparer tester, Downloader downloadManager, Database studentsRepository) {
        super(line, data, ioManager, tester, downloadManager, studentsRepository);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 3 && data.length != 4) {
            throw new InvalidInputException(this.getLine());
        }

        //problems might occur here
        if (data.length == 3) {
            ((OrderedTaker) this.getStudentsRepository()).orderAndTake(data[1], data[2]);
        }
        if (data.length == 4) {
            ((OrderedTaker) this.getStudentsRepository()).orderAndTake(data[1], data[2], Integer.parseInt(data[3]));
        }
    }
}
