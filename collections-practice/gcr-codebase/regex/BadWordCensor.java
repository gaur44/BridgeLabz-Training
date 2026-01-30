import java.util.*;
import java.util.regex.*;

public class BadWordCensor {

    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";

        List<String> badWords = List.of("damn", "stupid");

        String censored = censorBadWords(input, badWords);
        System.out.println(censored);
    }

    public static String censorBadWords(String text, List<String> badWords) {
        String regex = "\\b(" + String.join("|", badWords) + ")\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        return matcher.replaceAll("****");
    }
}
