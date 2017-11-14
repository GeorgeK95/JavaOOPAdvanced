package contracts;

import java.util.HashMap;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface DataFilter {
    public void printFilteredStudents(String filterType, int studentsCount, HashMap<String, Double> studentsWithMarks);

}
