import java.util.Scanner;

public class MaximumOfThreeNumbers {
    
    public static void main(String[] args) {
        int num1 = takeInput("Enter first number: ");
        int num2 = takeInput("Enter second number: ");
        int num3 = takeInput("Enter third number: ");
        
        int maxNum = findMaxNum(num1, num2, num3);
        
        System.out.println("The maximum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + maxNum);
    }
    
    public static int takeInput(String inputPrompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(inputPrompt);
        int value = sc.nextInt();
        sc.close();
        return value;
    }
    
    public static int findMaxNum(int x, int y, int z) {
        if (x >= y && x >= z) {
            return x;
        } else if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }
    }
}

