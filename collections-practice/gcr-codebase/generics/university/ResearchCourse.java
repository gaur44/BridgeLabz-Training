package university;

public class ResearchCourse extends CourseType {
    public ResearchCourse(String description) {
        super(description);
    }

    @Override
    public String getEvaluationType() {
        return "Research-Based";
    }
}

