public class SensitiveDataApp {
    public static void main(String[] args) {

        Customer customer = new Customer("Agraj", "1234-5678-9012");
        Product product = new Product("Laptop");

        processEncryption(customer);
        processEncryption(product);
    }

    static void processEncryption(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting data for: " +
                               obj.getClass().getSimpleName());
        } else {
            System.out.println("No encryption needed");
        }
    }
}
