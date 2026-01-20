package marketplace;

public class Gadget {
    private String brand;

    public Gadget(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Gadget: " + brand;
    }
}

