import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        try {
            char ch = text.charAt(text.length() + 1);
            System.out.println("character at length + 1 : " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException : " + e.getMessage());
        }

        sc.close();
    }
}
