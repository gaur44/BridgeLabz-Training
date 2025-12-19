import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int phy, chem, math;
        double average;
        char grade;
        String remarks;

        phy = sc.nextInt();
        chem = sc.nextInt();
        math = sc.nextInt();

        average = (phy + chem + math) / 3.0;

        if (average >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = 'C';
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        System.out.println("Average Mark = " + average);
        System.out.println("Grade = " + grade);
        System.out.println("Remarks = " + remarks);
        sc.close();
    }
}

