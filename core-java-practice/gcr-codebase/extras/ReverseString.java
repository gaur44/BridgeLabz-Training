import java.util.Scanner;

public class ReverseString {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
    
  
    public static String reverseString(String str) {
        char[] stringChars = str.toCharArray();
        int left = 0;
        int right = stringChars.length - 1;
        
        while (left < right) {
            char temp = stringChars[left];
            stringChars[left] = stringChars[right];
            stringChars[right] = temp;
            left++;
            right--;
        }
        return new String(stringChars);
    }
}

