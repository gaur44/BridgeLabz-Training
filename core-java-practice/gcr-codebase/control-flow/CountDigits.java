import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("number: ");
        int n = sc.nextInt();
        
        int counter = 0;
        int tmp = n;
        
        while (tmp != 0) {
            tmp = tmp / 10;
            counter++;
        }
        
        System.out.println("num of digits in " + n + " is " + counter);
        
        sc.close();
    }
}

