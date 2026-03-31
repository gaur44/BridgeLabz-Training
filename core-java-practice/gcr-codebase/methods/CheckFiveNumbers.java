import java.util.Scanner;

public class CheckFiveNumbers {

    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        return Integer.compare(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
            if (isPositive(nums[i])) {
                System.out.println("positive and " + (isEven(nums[i]) ? "Even" : "Odd"));
            } else {
                System.out.println("negative");
            }
        }
        int cmp = compare(nums[0], nums[4]);
        if (cmp == 0)
            System.out.println("first and last are equal.");
        else if (cmp > 0)
            System.out.println("first is greater than last.");
        else
            System.out.println("first is less than last.");
        sc.close();
    }
}