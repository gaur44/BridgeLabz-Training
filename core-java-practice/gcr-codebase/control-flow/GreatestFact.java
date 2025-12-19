import java.util.Scanner;

public class GreatestFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("number: ");
        int n = sc.nextInt();
        
        int greatestFact = 1;
        
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                greatestFact = i;
                break;
            }
        }
        
        System.out.println("Greatest factor of " + n + " (beside itself): " + greatestFact);
        
        sc.close();
    }
}

