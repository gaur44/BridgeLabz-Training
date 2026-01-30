import java.util.Scanner;

public class FlipKey {
    public String cleanseAndInvert(String word) {
        if (word == null || word.length() < 6) {
            return "";
        }

        // check for space, digit or special char
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetter(word.charAt(i))) {
                return "";
            }
        }

        // password generation
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < word.length(); i++) {
            if ((int) Character.toLowerCase(word.charAt(i)) % 2 != 0) {
                result.append((word.charAt(i)));
            }
        }

        // reverse result
        result.reverse();

        // convert to togglecase
        for (int i = 0; i < result.length(); i++) {
            if (i % 2 == 0) {
                result.setCharAt(i, Character.toUpperCase(result.charAt(i)));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Word: ");
        String input = scanner.nextLine();

        FlipKey flipKey  = new FlipKey();
        String result = flipKey.cleanseAndInvert(input);

        if (result == "") {
            System.out.println("Invalid Input");
        }
        else {
            System.out.println("The generated key is: " + result);
        }

    }
}

