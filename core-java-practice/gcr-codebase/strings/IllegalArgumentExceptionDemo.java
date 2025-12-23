import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    static void generateException(String str) {
        String result = str.substring(5, 2);
        System.out.println(result);
    }

    static void handleException(String text) {
        try {
            String result = text.substring(5, 2);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        try {
            generateException(str);
        } catch (RuntimeException e) {
            System.out.println("Exception generated and caught in main");
        }

        handleException(str);
        sc.close();
    }
}
