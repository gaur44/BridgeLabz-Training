import java.util.Scanner;

public class SplitStringCompare {
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    static String[] splitString(String str) {
        int len = findLength(str);

        int numWords = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                numWords++;
            }
        }

        int[] spaceIndex = new int[numWords + 1];
        int idx = 0;
        spaceIndex[idx++] = -1;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }
        spaceIndex[idx] = len;

        String[] words = new String[numWords];
        for (int i = 0; i < numWords; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word = word + str.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // compare two string arrays
    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] customMethodResult = splitString(str);
        String[] builtInMethodResult = str.split(" ");
        boolean res = compareArrays(customMethodResult, builtInMethodResult);
        System.out.println(res);
    }
}
