import java.util.Scanner;

public class UniqueCharFrequency {

    public static char[] findUnique(String s) {
        char[] temp = new char[s.length()];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[count] = c;
                count++;
            }
        }

        char[] unique = new char[count];
        for (int i = 0; i < count; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    public static String[][] getFrequency(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c]++;
        }

        char[] unique = findUnique(s);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String[][] result = getFrequency(str);

        System.out.println("Character frequencies:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " : " + result[i][1]);
        }

        sc.close();
    }
}