import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = removeDuplicates(input);

        System.out.println("String after removing duplicates : " + result);

        scanner.close();
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        boolean[] seenBefore = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seenBefore[ch]) {
                result.append(ch);
                seenBefore[ch] = true;
            }
        }

        return result.toString();
    }
}
