package university;

public abstract class CourseType {
    private final String description;

    public CourseType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract String getEvaluationType();
}

