import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("enter a positive integer");
        } else {
            System.out.println("factors of " + n + ":");
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }
        }        
    }
}

