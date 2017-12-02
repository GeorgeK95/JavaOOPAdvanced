package main.contracts;

import java.util.HashMap;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface DataSorter {
     void printSortedStudents(String compareType, int studentsCount, HashMap<String, Double> studentsWithMarks);

}
