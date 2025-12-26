import java.util.Scanner;

public class DecToBinConvert {
    public static String decimalToBinary(int num) {
        return Integer.toBinaryString(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter decimal number: ");
        int number = sc.nextInt();
        System.out.println("binary: " + decimalToBinary(number));
        sc.close();
    }
}