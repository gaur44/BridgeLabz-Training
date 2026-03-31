import java.util.Scanner;

public class GCFAndLCM {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("enter second number: ");
        int num2 = scanner.nextInt();
        
        int gcdRes = calcGCF(num1, num2);
        int lcmRes = calcLCM(num1, num2, gcdRes);
        
        System.out.println("GCF of " + num1 + " and " + num2 + " is: " + gcdRes);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmRes);
        
        scanner.close();
    }
    

    // method to calculate GCF
    public static int calcGCF(int a, int b) {
        if (a < 0) a = -a;
        if (b < 0) b = -b;
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
    
    // method to calculate LCM
    public static int calcLCM(int a, int b, int gcd) {
        if (gcd == 0) {
            return 0;
        }
        return Math.abs(a * b) / gcd;
    }
}

