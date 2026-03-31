import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("number: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("enter a positive integer");
        } else {
            System.out.println("Factors of " + n + ":");
            int count = 1;
            while (count < n) {
                if (n % count == 0) {
                    System.out.println(count);
                }
                count++;
            }
        }
        
        sc.close();
    }
}

