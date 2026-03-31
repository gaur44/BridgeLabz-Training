import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int y = sc.nextInt();

        if (y >= 1582) {
            boolean isLeap =
                    (y % 400 == 0) ||
                    (y % 4 == 0 && y % 100 != 0);

            if (isLeap) {
                System.out.println("Year " + y + " is a leap year");
            } else {
                System.out.println("Year " + y + " is not a leap year");
            }
        } else {
            System.out.println("Year should be 1582 or later");
        }

        sc.close();
    }
}
