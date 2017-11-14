package contracts;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface FilteredTaker {
    void filterAndTake(String courseName, String filter);

    void filterAndTake(String courseName, String filter, int studentsToTake);

}
