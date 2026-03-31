import java.util.Scanner;

public class DivideChocolates {
    // divide chocolates
    public static int[] findRemainderAndQuotient(int dividend, int divisor) {
        return new int[]{dividend / divisor, dividend % divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of chocolates: ");
        int numChocolates = sc.nextInt();
        System.out.print("enter number of children: ");
        int numChildren = sc.nextInt();
        int[] result = findRemainderAndQuotient(numChocolates, numChildren);
        System.out.println("each child gets: " + result[0] + ", remaining chocolates: " + result[1]);
    }
}