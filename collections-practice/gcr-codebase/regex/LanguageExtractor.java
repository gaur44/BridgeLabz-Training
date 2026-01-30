import java.util.*;
import java.util.regex.*;

public class LanguageExtractor {

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        List<String> languages = List.of(
                "Java",
                "Python",
                "JavaScript",
                "Go"
        );

        String regex = "\\b(" + String.join("|", languages) + ")\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        List<String> result = new ArrayList<>();

        while (matcher.find()) {
            result.add(matcher.group());
        }

        System.out.println(String.join(", ", result));
    }
}
