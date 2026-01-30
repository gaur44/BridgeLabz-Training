import java.util.regex.*;

public class EmailExtractor {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com, info@company.org and hello@company.com";

        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
