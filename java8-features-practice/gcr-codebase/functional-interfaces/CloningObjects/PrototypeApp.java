public class PrototypeApp {
    public static void main(String[] args) throws CloneNotSupportedException {

        Product original = new Product(101, "Laptop");
        Product copy = (Product) original.clone();

        System.out.println(original.id + " " + original.name);
        System.out.println(copy.id + " " + copy.name);
    }
}
