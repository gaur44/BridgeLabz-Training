import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vessels to be added");
        int numVessels = scanner.nextInt();
        scanner.nextLine();

        VesselUtil vesselUtil = new VesselUtil();
        System.out.println("Enter vessel details");
        for (int i = 0; i < numVessels; i++) {
            String inputString = scanner.nextLine();
            String[] vesselData = inputString.split(":");

            String vesselID = vesselData[0];
            String vesselName = vesselData[1];
            double averageSpeed = Double.parseDouble(vesselData[2]);
            String vesselType = vesselData[3];

            vesselUtil.addVesselPerformance(new Vessel(vesselID, vesselName, averageSpeed, vesselType));
        }

        System.out.println("Enter Vessel ID to Query: ");
        String inputID = scanner.nextLine();
        Vessel vessel = vesselUtil.getVesselByID(inputID);

        if (vessel != null) {
            System.out.println(vessel.toString());
        } else {
            System.out.println("Vessel ID :" + inputID + " not found.");
        }

        System.out.println("High Performance Vessels: ");
        for (Vessel highPerformingVessel : vesselUtil.getHighPerformanceVessels()) {
            System.out.println(highPerformingVessel.toString());
        }
        scanner.close();
    }
}