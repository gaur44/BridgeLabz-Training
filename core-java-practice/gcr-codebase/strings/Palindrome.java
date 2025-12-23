import java.util.Scanner;

public class Palindrome {
    
    public static boolean checkPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str = sc.nextLine();
                
        System.out.println("Is Palindrome: " + checkPalindrome(str));        
        sc.close();
    }
}
