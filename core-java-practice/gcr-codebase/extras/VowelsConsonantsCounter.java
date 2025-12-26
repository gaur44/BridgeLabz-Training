import java.util.Scanner;

public class VowelsConsonantsCounter {

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int numVowels = 0;
        int numConsonants = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                if (isVowel(input.charAt(i))) {
                    numVowels++;
                } else {
                    numConsonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + numVowels);
        System.out.println("Number of consonants: " + numConsonants);

        scanner.close();
    }
}
