import java.util.Scanner;

public class SeparateOddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter natural number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("please enter a number greater than zero.");
            return;
        }

        int[] odd = new int[num / 2 + 1];
        int[] even = new int[num / 2 + 1];
        int oddIndex = 0, evenIndex = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)
                even[evenIndex++] = i;
            else
                odd[oddIndex++] = i;
        }

        System.out.println("even numbers:");
        for (int i = 0; i < evenIndex; i++)
            System.out.println(even[i] + " ");
        System.out.println("odd numbers:");
        for (int i = 0; i < oddIndex; i++)
            System.out.println(odd[i] + " ");
    }
}