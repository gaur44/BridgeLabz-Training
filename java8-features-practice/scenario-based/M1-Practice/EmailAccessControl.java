import java.util.*;
import java.util.regex.*;

public class EmailAccessControl {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[a-z]{3,}\\.[a-z]{3,}\\d{4,}@(sales|marketing|IT|product)\\.company\\.com$");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String email = sc.nextLine();

            if (isValid(email)) {
                System.out.println("Access Granted");
            } else {
                System.out.println("Access Denied");
            }
        }

        sc.close();
    }

    private static boolean isValid(String email) {
        if (email.contains(" ")) {
            return false;
        }

        return EMAIL_PATTERN.matcher(email).matches();
    }
}
