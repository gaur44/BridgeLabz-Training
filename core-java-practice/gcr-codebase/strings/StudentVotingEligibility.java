import java.util.Scanner;
import java.util.Random;

public class StudentVotingEligibility {

    // generate ages
    public static int[] genRandAges(int numStudents) {
        Random random = new Random();
        int[] ages = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            ages[i] = random.nextInt(90) + 10;
        }

        return ages;
    }

    public static String[][] isEligible(int[] ages) {
        String[][] isEligible = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            isEligible[i][0] = String.valueOf(ages[i]); // Age

            if (ages[i] < 0) {
                isEligible[i][1] = "false";
            }
            // check if age is 18 or above
            else if (ages[i] >= 18) {
                isEligible[i][1] = "true";
            } else {
                isEligible[i][1] = "false";
            }
        }

        return isEligible;
    }

    // display table
    public static void displayTable(String[][] data) {
        System.out.println("\nAge\tVoting Eligibility");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter number of students: ");
        int numStudents = scanner.nextInt();
        int[] ages = genRandAges(numStudents);
        String[][] eligibilityArray = isEligible(ages);
        displayTable(eligibilityArray);
        scanner.close();
    }
}