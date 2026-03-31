import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    static void generateException(String[] names, int index) {
        System.out.println("Name: " + names[index]);
    }

    static void handleException(String[] names, int index) {
        try {
            System.out.println("Name: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namesArray = {"Alex", "Bob", "Robert"};

        System.out.print("index to access: ");
        int index = sc.nextInt();

        try {
            generateException(namesArray, index);
        } catch (RuntimeException e) {
            System.out.println("Exception generated and caught in main");
        }

        handleException(namesArray, index);
    }
}
