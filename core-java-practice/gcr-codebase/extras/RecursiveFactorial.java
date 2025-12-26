import java.util.Scanner;

public class RecursiveFactorial {
    
    public static void main(String[] args) {
        int number = getInput();
        long factorial = factorial(number);
        printResult(number, factorial);
    }
    
    // input with prompt
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        // display prompt and get input
        System.out.print("calculate factorial of: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    // recursive factorial calculation
    public static long factorial(int n) {
        if (n < 0) {
            return -1;
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * factorial(n - 1);
    }

    // display result
    public static void printResult(int number, long factorial) {
        if (factorial == -1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}

