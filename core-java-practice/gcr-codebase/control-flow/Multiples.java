import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (n <= 0 || n >= 100) {
            System.out.println("Enter positive num less than 100");
        } else {
            System.out.println("Multiples of " + n + " below 100:");
            for (int i = 100; i >= 1; i--) {
                if (i % n == 0) {
                    System.out.println(i);
                }
            }
        }
        
        scanner.close();
    }
}

