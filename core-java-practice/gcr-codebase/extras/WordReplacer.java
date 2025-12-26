import java.util.Scanner;

public class WordReplacer {

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // replace the old word with the new word
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // prompt for input
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word you want to replace: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter the word you want to replace it with: ");
        String newWord = scanner.nextLine();

        // replace the word and display the result
        String updatedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.print("Updated sentence: " + updatedSentence);
        
        scanner.close();
    }
}
