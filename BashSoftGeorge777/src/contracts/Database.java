package contracts;

import dataStructures.SimpleSortedList;

import java.io.IOException;
import java.util.Comparator;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface Database {
    void loadData(String fileName) throws IOException;

    void unloadData();

    SimpleSortedList<Course> getAllCoursesSorted(Comparator<Course> cmp);

    SimpleSortedList<Student> getAllStudentsSorted(Comparator<Student> cmp);

}
