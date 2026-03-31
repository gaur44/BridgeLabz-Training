import java.util.Scanner;

public class CheckPalindrome {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        scanner.close();
    }
    

    public static boolean isPalindrome(String str) {
        String lowerCaseStr = str.toLowerCase();
        int leftIndex = 0;
        int rightIndex = lowerCaseStr.length() - 1;
        
        while (leftIndex < rightIndex) {
            if (lowerCaseStr.charAt(leftIndex) != lowerCaseStr.charAt(rightIndex)) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        
        return true;
    }
}

