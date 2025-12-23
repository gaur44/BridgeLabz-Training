import java.util.Scanner;

public class ShortestAndLongestWordsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a sentence: ");
        String text = scanner.nextLine() + " ";

        String word = "", shortest = "", longest = "";
        int min = Integer.MAX_VALUE, max = 0;

        for (int i = 0; i < text.length(); i++) {
            char chr = text.charAt(i);
            if (chr != ' ') {
                word += chr;
            } else if (!word.isEmpty()) {
                if (word.length() < min) {
                    min = word.length();
                    shortest = word;
                }
                if (word.length() > max) {
                    max = word.length();
                    longest = word;
                }
                word = "";
            }
        }


        // print results
        System.out.println("shortest word: " + shortest);
        System.out.println("longest word: " + longest);
        scanner.close();
    }
}
