import java.util.Scanner;

public class IPAddressValidator {
    
    private static final String IPV4_REGEX =
        "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}" +
        "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

    public static boolean isValidIP(String ip) {
        return ip.matches(IPV4_REGEX);
    }

    public static void main(String[] args) {
        String licensePlateNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IP address: ");
        licensePlateNumber = scanner.nextLine();
        scanner.close();

        boolean isValid = IPAddressValidator.isValidIP(licensePlateNumber);

        if (isValid) {
            System.out.println("Valid IPv4");
        }
        else {
            System.out.println("Invalid IPv4");
        }
    }
}
