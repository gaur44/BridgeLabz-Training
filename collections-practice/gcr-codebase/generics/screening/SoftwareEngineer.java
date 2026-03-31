package screening;

public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public boolean isQualified() {
        return true; // assume skills passed
    }
}

