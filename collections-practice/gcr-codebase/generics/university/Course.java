package university;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private final String courseName;
    private final List<T> studentsOrEvaluations = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(T evaluation) {
        studentsOrEvaluations.add(evaluation);
    }

    public List<T> getEvaluations() {
        return studentsOrEvaluations;
    }
}

