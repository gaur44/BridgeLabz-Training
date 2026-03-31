import java.util.Scanner;

public class NumberFormatExceptionDemo {
    static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Parsed number: " + num);
    }
    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a value: ");
        String input = sc.nextLine();

        try {
            generateException(input);
        } catch (RuntimeException e) {
            System.out.println("exception generated and caught in main");
        }
        handleException(input);
    }
}

