package screening;

public class DataScientist extends JobRole {

    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public boolean isQualified() {
        return true;
    }
}

