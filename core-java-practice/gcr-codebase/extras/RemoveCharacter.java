import java.util.Scanner;

public class RemoveCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a string: ");
        String input = scanner.nextLine();

        System.out.print("enter the character to be removed: ");
        char charToRemove = scanner.nextLine().charAt(0);

        String result = removeCharacter(input, charToRemove);

        System.out.println("string after removing character: " + result);

        scanner.close();
    }

    public static String removeCharacter(String str, char ch) {
        StringBuilder resultantStr = new StringBuilder();

        // append all character ignoring specified character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                resultantStr.append(str.charAt(i));
            }
        }

        return resultantStr.toString();
    }
}
