package main.models;

import main.StaticData.ExceptionMessages;
import main.contracts.Course;
import main.contracts.Student;
import main.exceptions.DuplicateEntryInStructureException;
import main.exceptions.InvalidStringException;
import main.exceptions.KeyNotFoundException;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class SoftUniStudent implements Student {
    private String userName;
    private Map<String, Course> enrolledCourses;
    private Map<String, Double> marksByCourse;

    public SoftUniStudent(String userName) {
        this.setUserName(userName);
        this.enrolledCourses = new LinkedHashMap<>();
        this.marksByCourse = new LinkedHashMap<>();
    }

    public void setMarkOnCourse(String courseName, int... scores) {
        if (!this.enrolledCourses.containsKey(courseName)) {
            throw new KeyNotFoundException();
        }

        if (Course.NUMBER_OF_TASKS_ON_EXAM < scores.length) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_NUMBER_OF_SCORES);
        }

        double mark = calculateMark(scores);
        this.marksByCourse.put(courseName, mark);
    }

    private double calculateMark(int[] scores) {
        double percentageOfSolvedExam = Arrays.stream(scores).sum() /
                (double) (Course.NUMBER_OF_TASKS_ON_EXAM * Course.MAX_SCORE_ON_EXAM_TASK);
        return percentageOfSolvedExam * 4 + 2;
    }

    public void enrollInCourse(Course softUniCourse) {
        if (this.enrolledCourses.containsKey(softUniCourse.getName())) {
            throw new DuplicateEntryInStructureException(this.userName, softUniCourse.getName());
        }
        this.enrolledCourses.put(softUniCourse.getName(), softUniCourse);
    }

    public String getUserName() {
        return userName;
    }

    private void setUserName(String userName) {
        if (userName == null || userName.equals("")) {
            throw new InvalidStringException();
        }
        this.userName = userName;
    }

    public Map<String, Course> getEnrolledCourses() {
        return Collections.unmodifiableMap(enrolledCourses);
    }

    public void setEnrolledCourses(Map<String, Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public Map<String, Double> getMarksByCourse() {
        return Collections.unmodifiableMap(marksByCourse);
    }

    public void setMarksByCourse(Map<String, Double> marksByCourse) {
        this.marksByCourse = marksByCourse;
    }

    @Override
    public int compareTo(Student o) {
        return this.getUserName().compareTo(o.getUserName());
    }

    @Override
    public String toString() {
        return this.getUserName();
    }
}
