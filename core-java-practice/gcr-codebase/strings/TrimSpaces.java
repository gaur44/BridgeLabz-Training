import java.util.Scanner;

public class TrimSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter string with spaces: ");
        String str = scanner.nextLine();

        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;

        // trim spaces
        String trimmedManual = "";
        for (int i = start; i <= end; i++) {
            trimmedManual += str.charAt(i);
        }

        String trimmedBuiltIn = str.trim();
        boolean areEqual = trimmedManual.equals(trimmedBuiltIn);

        System.out.println("Manual Trim: [" + trimmedManual + "]");
        System.out.println("Built-in Trim: [" + trimmedBuiltIn + "]");
        System.out.println("Both Equal? " + areEqual);
        scanner.close();
    }
}
