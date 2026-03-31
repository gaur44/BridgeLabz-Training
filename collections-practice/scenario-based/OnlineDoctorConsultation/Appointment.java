public class Appointment {
    private String patientName;
    private String slot;

    public Appointment(String patientName, String slot) {
        this.patientName = patientName;
        this.slot = slot;
    }

    public String toString() {
        return patientName + " at " + slot;
    }
}
