import java.util.Scanner;

public class BinaryToDecimal {
    public static int binToDec(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter binary number: ");
        String bin = sc.nextLine();
        System.out.println("Decimal: " + binaryToDecimal(bin));
        sc.close();
    }
}