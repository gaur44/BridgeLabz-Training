import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt for first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // prompt for second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // check if the strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }

        scanner.close();
    }

    public static boolean areAnagrams(String str1, String str2) {
        // if lengths are different return false
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

        // if sorted arrays of the strings are same return true else false
        return java.util.Arrays.equals(charArray1, charArray2);
    }
}
