package university;

public class AssignmentCourse extends CourseType {
    public AssignmentCourse(String description) {
        super(description);
    }

    @Override
    public String getEvaluationType() {
        return "Assignment-Based";
    }
}

