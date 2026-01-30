import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class HexColorValidator {
    public static boolean isValidPlate(String s) {
        Pattern pattern = Pattern.compile("#[A-Fa-f0-9]{6}");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String hexColor;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter hex color value: ");
        hexColor = scanner.nextLine();
        
        scanner.close();

        boolean isValid = HexColorValidator.isValidPlate(hexColor);

        if (isValid) {
            System.out.println("Valid Hex Color");
        }
        else {
            System.out.println("Invalid Hex Color");
        }
    }
}
