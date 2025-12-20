import java.util.Scanner;

public class MultiplicationSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] multResult = new int[4];

        for (int i = 6, j = 0; i <= 9; i++, j++) {
            multResult[j] = num * i;
        }

        for (int i = 0; i < multResult.length; i++) {
            System.out.println(num + " * " + (6 + i) + " = " + multResult[i]);
        }
    }
}