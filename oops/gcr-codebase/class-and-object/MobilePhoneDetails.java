public class MobilePhoneDetails {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("VIVO", "VIVO V29", 15999.0);
        phone1.displayDetails();
        System.out.println("------");
        MobilePhone phone2 = new MobilePhone("APPLE", "iphone pro16", 79999.0);
        phone2.displayDetails();
    }
}

class MobilePhone {
    String brand;
    String model;
    double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // display phone details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
