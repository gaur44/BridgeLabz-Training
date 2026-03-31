public class Patient {
    // static variable
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    // instance variables
    private String name;
    private int age;
    private String ailment;

    // final keyword for unique patient ID
    private final String patientID;

    // constructor using this keyword
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid patient instance.");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("P001", "Lathika", 30, "Flu");
        Patient p2 = new Patient("P002", "Lidiya", 45, "Fracture");

        getTotalPatients();

        p1.displayPatientDetails();
        p2.displayPatientDetails();
    }
}
