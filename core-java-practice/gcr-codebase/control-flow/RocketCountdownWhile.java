import java.util.Scanner;

public class RocketCountdownWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting countdown value: ");
        int count = sc.nextInt();

        while (count >= 1) {
            System.out.println(count);
            count--;
        }

        System.out.println("Launch!");

    }
}
