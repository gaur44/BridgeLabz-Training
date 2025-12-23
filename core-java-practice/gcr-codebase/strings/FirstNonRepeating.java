import java.util.Scanner;

public class FirstNonRepeating {
    
    public static char getFirstNonRepeatingChar(String s) {
        int[] freq = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            freq[chr]++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c] == 1) {
                return c;
            }
        }
        
        return '\0';
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        
        char result = getFirstNonRepeatingChar(str);
        
        if (result != '\0') {
            System.out.println("first non-repeating character: " + result);
        } else {
            System.out.println("no non-repeating character found");
        }
        
        sc.close();
    }
}