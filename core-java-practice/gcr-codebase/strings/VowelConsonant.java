import java.util.*;
class VowelConsonant {
    static String check(char c) {
        if (c >= 'A' && c <= 'Z')
            c = (char)(c + 32);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return "Vowel";
        else if (c >= 'a' && c <= 'z')
            return "Consonant";
        return "Not a Letter";
    }
    
    static String[][] find(String s) {
        String[][] a = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            a[i][0] = String.valueOf(s.charAt(i));
            a[i][1] = check(s.charAt(i));
        }
        return a;
    }
    
    static void display(String[][] a) {
        System.out.println("Character\tType");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i][0] + "\t\t" + a[i][1]);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] a = find(s);
        display(a);
    }
}