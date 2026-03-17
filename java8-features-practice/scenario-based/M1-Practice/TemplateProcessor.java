import java.util.*;
import java.util.regex.*;

public class TemplateProcessor {

    private static final Pattern PLACEHOLDER =
            Pattern.compile("\\$\\{([A-Z]+):([^}]+)\\}");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            System.out.println(process(line));
        }

        sc.close();
    }

    private static String process(String line) {
        Matcher matcher = PLACEHOLDER.matcher(line);
        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            String type = matcher.group(1);
            String value = matcher.group(2);

            String replacement = handle(type, value);

            matcher.appendReplacement(result, replacement);
        }

        matcher.appendTail(result);
        return result.toString();
    }

    private static String handle(String type, String value) {

        if (type.equals("UPPER")) {
            return value.toUpperCase();
        }

        if (type.equals("LOWER")) {
            return value.toLowerCase();
        }

        if (type.equals("DATE")) {
            return handleDate(value);
        }

        if (type.equals("REPEAT")) {
            return handleRepeat(value);
        }

        return "INVALID";
    }

    private static String handleDate(String value) {
        if (!value.matches("\\d{2}-\\d{2}-\\d{4}")) {
            return "INVALID";
        }

        String[] parts = value.split("-");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (month < 1 || month > 12) return "INVALID";

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (isLeap(year)) {
            days[1] = 29;
        }

        if (day < 1 || day > days[month - 1]) {
            return "INVALID";
        }

        return year + "/" + String.format("%02d", month) + "/" + String.format("%02d", day);
    }

    private static boolean isLeap(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }

    private static String handleRepeat(String value) {
        String[] parts = value.split(",");

        if (parts.length != 2) return "INVALID";

        String word = parts[0];
        int count;

        try {
            count = Integer.parseInt(parts[1]);
        } catch (Exception e) {
            return "INVALID";
        }

        if (count < 0) return "INVALID";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(word);
        }

        return sb.toString();
    }
}
