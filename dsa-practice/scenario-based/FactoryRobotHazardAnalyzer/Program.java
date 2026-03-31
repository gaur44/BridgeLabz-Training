import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RobotHazardAuditor auditor = new RobotHazardAuditor();

        try {
            System.out.println("Enter Arm Precision (0.0 - 1.0):");
            double armPrecision = scanner.nextDouble();

            System.out.println("Enter Worker Density (1 - 20):");
            int workerDensity = scanner.nextInt();

            scanner.nextLine(); // consume leftover newline

            System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
            String machineryState = scanner.nextLine();

            double risk = auditor.CalculateHazardRisk(
                    armPrecision,
                    workerDensity,
                    machineryState
            );

            System.out.println("Robot Hazard Risk Score: " + risk);

        } catch (RobotSafetyException e) {
            System.out.println(e.getMessage());
        }
    }
}

