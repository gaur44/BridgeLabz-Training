import java.util.Scanner;

public class CalculateFactorsAndSum {
    public static int[] findFactors(int n) {
        int factorCount = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                factorCount++;
            }
        }

        int[] factArr = new int[factorCount];
        int indx = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                factArr[indx] = i;
                indx++;
            }
        }
        return factArr;
    }

    public static int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int productArr(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    public static double sumSquaresArr(int[] arr) {
        int sumSq = 0;
        for (int i = 0; i < arr.length; i++) {
            sumSq += Math.pow(arr[i], 2);
        }
        return sumSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int f : factors)
            System.out.print(f + " ");
        System.out.println("\nSum: " + sumArr(factors));
        System.out.println("Product: " + productArr(factors));
        System.out.printf("Sum of squares: %.2f%n", sumSquaresArr(factors));
    }

}