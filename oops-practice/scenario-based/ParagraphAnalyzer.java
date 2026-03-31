import java.util.Scanner;

public class ParagraphAnalyzer {

    public static void analyzeParagraph(String paragraph, String oldWord, String newWord) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            System.out.println("Paragraph is empty.");
            return;
        }

        paragraph = paragraph.trim();

        // split words
        String[] words = paragraph.split("\\s+");

        // count words
        int wordCount = words.length;

        // find longest word
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        String replacedParagraph =
                paragraph.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);

        System.out.println("Word count: " + wordCount);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Updated paragraph:");
        System.out.println(replacedParagraph);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter paragraph:");
        String paragraph = sc.nextLine();

        System.out.print("Word to replace: ");
        String oldWord = sc.next();

        System.out.print("Replace with: ");
        String newWord = sc.next();

        analyzeParagraph(paragraph, oldWord, newWord);
        sc.close();
    }
}
