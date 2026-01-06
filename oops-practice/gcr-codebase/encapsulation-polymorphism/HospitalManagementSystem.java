public class HospitalManagementSystem {
    public static void main(String[] args) {

        Patient[] patients = new Patient[2];

        patients[0] = new InPatient("P101", "Rahul", 30, 5, 2000);
        patients[1] = new OutPatient("P102", "Rohan", 45, 600);

        for (Patient p : patients) {

            p.getPatientDetails();
            System.out.println("Total Bill: ₹" + p.calculateBill());

            if (p instanceof MedicalRecord) {
                MedicalRecord m = (MedicalRecord) p;
                m.addRecord("Diagnosis Completed.");
                m.viewRecords();
            }

            System.out.println();
        }
    }
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    private String diagnosis;
    private String medicalHistory;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // abstract method
    public abstract double calculateBill();

    // concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected void setMedicalHistory(String history) {
        this.medicalHistory = history;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    protected String getMedicalHistory() {
        return medicalHistory;
    }
}

interface MedicalRecord {
    void addRecord(String record);

    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyCharge;
    private StringBuilder records = new StringBuilder();

    public InPatient(String id, String name, int age,
            int daysAdmitted, double dailyCharge) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String record) {
        records.append(record).append("\n");
        setDiagnosis("Under Treatment");
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        System.out.println(records.toString());
    }
}

class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private StringBuilder records = new StringBuilder();

    public OutPatient(String id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.append(record).append("\n");
        setDiagnosis("Routine Check");
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        System.out.println(records.toString());
    }
}
