import java.util.Scanner;

public class CountSubstringOccurences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the substring to find: ");
        String substr = scanner.nextLine();

        int count = countSubstringInstances(str, substr);

        System.out.println("The substring appears " + count + " time(s).");

        scanner.close();
    }

    public static int countSubstringInstances(String mainString, String substring) {
        if (substring.length() == 0) {
            return 0;
        }

        int res = 0;
        int index = 0;
        while ((index = mainString.indexOf(substring, index)) != -1) {
            res++;
            index += substring.length();
        }

        return res;
    }
}
