import java.util.Scanner;

public class PositiveEvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        for (int num : nums) {
            if (num > 0) {
                System.out.println(num + " is positive and " + (num % 2 == 0 ? "even" : "odd"));
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println("zero");
            }
        }

        if (nums[0] > nums[4])
            System.out.println("First is Greater than Last");
        else if (nums[0] < nums[4])
            System.out.println("First is Smaller than Last");
        else
            System.out.println("First equals Last");
        sc.close();
    }
}