package marketplace;

public class Clothing {
    private String type;

    public Clothing(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Clothing: " + type;
    }
}

