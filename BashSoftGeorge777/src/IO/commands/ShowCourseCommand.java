package IO.commands;

import contracts.*;
import exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class ShowCourseCommand extends Command {

    public ShowCourseCommand(String line, String[] data, DirectoryManager ioManager, ContentComparer tester, Downloader downloadManager, Database studentsRepository) {
        super(line, data, ioManager, tester, downloadManager, studentsRepository);

    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2 && data.length != 3) {
            throw new InvalidInputException(this.getLine());

        }
        //problems eventually
        if (data.length == 2) {
            ((Requester) this.getStudentsRepository()).getStudentsByCourse(data[1]);
        }
        if (data.length == 3) {
            ((Requester) this.getStudentsRepository()).getStudentMarkInCourse(data[1], data[2]);
        }
    }
}
