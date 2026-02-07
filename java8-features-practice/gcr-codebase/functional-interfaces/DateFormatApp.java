import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatApp {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        System.out.println(DateUtils.formatDate(date, "dd-MM-yyyy"));
        System.out.println(DateUtils.formatDate(date, "yyyy/MM/dd"));
    }
}

interface DateUtils {

    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
