import java.util.Scanner;
import java.util.Arrays;

public class CharacterToArrayComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter string: ");
        String text = sc.next();

        char[] characterArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characterArray[i] = text.charAt(i);
        }

        char[] characterArrayBuiltinMethod = text.toCharArray();

        boolean isEqual = Arrays.equals(characterArray, characterArrayBuiltinMethod);

        System.out.println("char array with custom method: " + Arrays.toString(characterArray));
        System.out.println("using built-in toCharArray method: " + Arrays.toString(characterArrayBuiltinMethod));
        System.out.println("are arrays equal?: " + isEqual);
        sc.close();
    }
}
