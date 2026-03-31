import java.util.Scanner;

public class StudentVotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]studentAges = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("enter age " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();

            if (studentAges[i] < 0) {
                System.out.println("Invalid age");
            } else if (studentAges[i] >= 18) {
                System.out.println("The student with age " + studentAges[i] + " can vote.");
            } else {
                System.out.println("The student with age " + studentAges[i] + " cannot vote.");
            }
        }
    }
}