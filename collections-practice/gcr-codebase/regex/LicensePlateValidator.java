import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class LicensePlateValidator {
    public static boolean isValidPlate(String s) {
        Pattern pattern = Pattern.compile("[A-Z]{2}\\d{4}");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String licensePlateNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your license plate number: ");
        licensePlateNumber = scanner.nextLine();
        scanner.close();

        boolean isValid = LicensePlateValidator.isValidPlate(licensePlateNumber);

        if (isValid) {
            System.out.println("Valid Plate Number");
        }
        else {
            System.out.println("Invalid Plate Number");
        }
    }
}
