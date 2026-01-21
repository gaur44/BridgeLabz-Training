package university;

public class ExamCourse extends CourseType {
    public ExamCourse(String description) {
        super(description);
    }

    @Override
    public String getEvaluationType() {
        return "Exam-Based";
    }
}

