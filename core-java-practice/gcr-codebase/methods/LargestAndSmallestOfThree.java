import java.util.Scanner;

public class LargestAndSmallestOfThree {
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(System.in);
        System.out.print("enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] result = findSmallestAndLargest(a, b, c);

        // print result
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
    }
}