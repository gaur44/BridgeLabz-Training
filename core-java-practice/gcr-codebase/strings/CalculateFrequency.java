import java.util.Scanner;

public class CalculateFrequency {

    // find frequency
    public static int[][] getFrequency(String s) {
        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }

        int[][] result = new int[count][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int[][] result = getFrequency(str);

        System.out.println("Character frequencies:");
        for (int i = 0; i < result.length; i++) {
            char c = (char) result[i][0];
            int f = result[i][1];
            System.out.println(c + " : " + f);
        }

        sc.close();
    }
}
