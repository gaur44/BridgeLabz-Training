package screening;

public class ProductManager extends JobRole {

    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public boolean isQualified() {
        return false; // eg. did not pass screening
    }
}

