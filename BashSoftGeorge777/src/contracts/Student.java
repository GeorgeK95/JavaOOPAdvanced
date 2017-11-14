package contracts;

import java.util.Map;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public interface Student {
    public void setMarkOnCourse(String courseName, int... scores);

    public void enrollInCourse(Course softUniCourse);

    public String getUserName();

    public Map<String, Course> getEnrolledCourses();

    public void setEnrolledCourses(Map<String, Course> enrolledCourses);

    public Map<String, Double> getMarksByCourse();

    public void setMarksByCourse(Map<String, Double> marksByCourse);
}
