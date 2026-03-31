import java.util.*;
import java.util.regex.*;

public class ShipmentValidator {

    // Precompiled patterns
    private static final Pattern CODE_PATTERN =
            Pattern.compile("^SHIP-[1-9]\\d{5}$");

    private static final Pattern DATE_PATTERN =
            Pattern.compile("^(20\\d{2})-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$");

    private static final Pattern MODE_PATTERN =
            Pattern.compile("^(AIR|SEA|ROAD|RAIL|EXPRESS|FREIGHT)$");

    private static final Pattern WEIGHT_PATTERN =
            Pattern.compile("^(0|[1-9]\\d*)(\\.\\d{1,2})?$");

    private static final Pattern STATUS_PATTERN =
            Pattern.compile("^(DELIVERED|CANCELLED|IN_TRANSIT)$");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split("\\|");

            if (parts.length != 5) {
                System.out.println("NON-COMPLIANT RECORD");
                continue;
            }

            if (isValid(parts[0], parts[1], parts[2], parts[3], parts[4])) {
                System.out.println("COMPLIANT RECORD");
            } else {
                System.out.println("NON-COMPLIANT RECORD");
            }
        }

        sc.close();
    }

    private static boolean isValid(String code, String date, String mode,
                                   String weight, String status) {

        return isValidCode(code) &&
               isValidDate(date) &&
               isValidMode(mode) &&
               isValidWeight(weight) &&
               isValidStatus(status);
    }

    private static boolean isValidCode(String code) {
        if (!CODE_PATTERN.matcher(code).matches()) {
            return false;
        }

        // consecutive digit check
        char prev = 0;
        int count = 0;

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);

            if (!Character.isDigit(ch)) continue;

            if (ch == prev) {
                count++;
                if (count > 3) return false;
            } else {
                prev = ch;
                count = 1;
            }
        }

        return true;
    }

    private static boolean isValidDate(String date) {
        Matcher matcher = DATE_PATTERN.matcher(date);

        if (!matcher.matches()) {
            return false;
        }

        int year = Integer.parseInt(matcher.group(1));
        int month = Integer.parseInt(matcher.group(2));
        int day = Integer.parseInt(matcher.group(3));

        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        return day <= daysInMonth[month - 1];
    }

    private static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    private static boolean isValidMode(String mode) {
        return MODE_PATTERN.matcher(mode).matches();
    }

    private static boolean isValidWeight(String weight) {
        if (!WEIGHT_PATTERN.matcher(weight).matches()) {
            return false;
        }

        double value = Double.parseDouble(weight);

        return value > 0 && value <= 999999.99;
    }

    private static boolean isValidStatus(String status) {
        return STATUS_PATTERN.matcher(status).matches();
    }
}
