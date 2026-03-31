import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        
        System.out.print("Enter power: ");
        int pow = sc.nextInt();
        
        if (n <= 0 || pow <= 0) {
            System.out.println("Please enter positive integers");
        } else {
            int result = 1;
            for (int i = 1; i <= pow; i++) {
                result = result * n;
            }
            System.out.println(n + " raised to the power " + pow + " = " + result);
        }
        
        sc.close();
    }
}

