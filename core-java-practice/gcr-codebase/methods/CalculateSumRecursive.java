import java.util.Scanner;

public class CalculateSumRecursive {
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int computeSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int recSum = recursiveSum(n);
        int formSum = computeSum(n);
        System.out.println("Sum with recursion: " + recSum + ", Sum with formula : " + formSum);
    }
}