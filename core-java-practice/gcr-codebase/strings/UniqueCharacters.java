import java.util.Scanner;

public class UniqueCharacters {
    
    public static int getLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
            return i;
        }
    }
    
    // find unique
    public static char[] getUnique(String s) {
        int len = getLength(s);
        char[] arr = new char[len];
        int count = 0;
        
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            boolean found = false;
            
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                arr[count] = c;
                count++;
            }
        }
        
        char[] unique = new char[count];
        for (int i = 0; i < count; i++) {
            unique[i] = arr[i];
        }
        
        return unique;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("string: ");
        String str = sc.nextLine();
        
        char[] unique = getUnique(str);
        
        System.out.print("unique characters: ");
        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i] + " ");
        }
        
        sc.close();
    }
}