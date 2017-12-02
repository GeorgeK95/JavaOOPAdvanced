package main.IO.commands;

import main.annotations.Alias;
import main.contracts.*;
import main.exceptions.InvalidInputException;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
@Alias(value = "show")
public class ShowCourseCommand extends Command {
    private Database studentsRepository;

    public ShowCourseCommand(String line, String[] data) {
        super(line, data);
    }

    @Override
    public void execute() throws Exception {
        String[] data = this.getData();
        if (data.length != 2 && data.length != 3) {
            throw new InvalidInputException(this.getLine());

        }
        //problems eventually
        if (data.length == 2) {
            ((Requester) this.studentsRepository).getStudentsByCourse(data[1]);
        }
        if (data.length == 3) {
            ((Requester) this.studentsRepository).getStudentMarkInCourse(data[1], data[2]);
        }
    }
}
