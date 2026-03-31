import java.util.Scanner;

public class LicensePlateValidator {
    public static boolean isValidPlate(String s) {
        return s.matches("[A-Z]{2}\\d{4}");
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
