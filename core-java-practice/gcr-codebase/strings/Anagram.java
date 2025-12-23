import java.util.Scanner;

public class Anagram {
    public static boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("enter second string: ");
        String str2 = sc.nextLine();

        boolean result = checkAnagram(str1, str2);

        if (result) {
            System.out.println("the strings are anagrams");
        } else {
            System.out.println("the strings are not anagrams");
        }

        sc.close();
    }
}