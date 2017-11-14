package contracts;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface Requester extends Database {
    void getStudentMarkInCourse(String course, String student);

    void getStudentsByCourse(String course);
}
