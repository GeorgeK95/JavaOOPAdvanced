package models;

import contracts.Course;
import contracts.Student;
import exceptions.DuplicateEntryInStructureException;
import exceptions.InvalidStringException;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class SoftUniCourse implements Course {


    private String name;
    private Map<String, Student> studentsByName;

    public SoftUniCourse(String name) {
        this.setName(name);
        this.studentsByName = new LinkedHashMap<>();
    }

    public void enrollStudent(Student softUniStudent) {
        if (this.studentsByName.containsKey(softUniStudent.getUserName())) {
            throw new DuplicateEntryInStructureException(softUniStudent.getUserName(), this.getName());
        }
        this.studentsByName.put(softUniStudent.getUserName(), softUniStudent);
    }

    public Map<String, Student> getStudentsByName() {
        return Collections.unmodifiableMap(studentsByName);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.equals("")) {
            throw new InvalidStringException();
        }
        this.name = name;
    }

    @Override
    public int compareTo(Course o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return this.getName()   ;
    }
}
