import java.util.Scanner;

public class CompareSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String text = sc.next();
        System.out.print("start index: ");
        int startIndex = sc.nextInt();
        System.out.print("end index: ");
        int endIndex = sc.nextInt();

        String substring = "";
        for (int i = startIndex; i < endIndex && i < text.length(); i++) {
            substring += text.charAt(i);
        }

        String inbuiltSubstringMethod = text.substring(startIndex, Math.min(endIndex, text.length()));
        boolean equal = true;
        if (substring.length() != inbuiltSubstringMethod.length()) {
            equal = false;
        } else {
            for (int i = 0; i < substring.length(); i++) {
                if (substring.charAt(i) != inbuiltSubstringMethod.charAt(i)) {
                    equal = false;
                    break;
                }
            }
        }

        System.out.println("Substring: " + substring);
        System.out.println("Built-in substring: " + inbuiltSubstringMethod);
        System.out.println("Are both substrings equal? " + equal);
        sc.close();
    }
}
