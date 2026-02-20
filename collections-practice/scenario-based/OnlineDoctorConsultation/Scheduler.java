import java.util.*;

public class Scheduler {
    private Map<String, List<Doctor>> doctors = new HashMap<>();

    public void addDoctor(Doctor d) {
        doctors.computeIfAbsent(d.getSpecialization(), k -> new ArrayList<>()).add(d);
    }

    public void book(String spec, String doctorName, String patient, String slot)
            throws SlotUnavailableException {

        for (Doctor d : doctors.getOrDefault(spec, new ArrayList<>())) {
            if (d.getName().equals(doctorName)) {
                d.book(patient, slot);
                System.out.println("Booked with Dr." + doctorName);
                return;
            }
        }
        System.out.println("Doctor not found");
    }

    public void showHistory(String spec) {
        for (Doctor d : doctors.getOrDefault(spec, new ArrayList<>())) {
            System.out.println("Dr." + d.getName() + " History: " + d.getHistory());
        }
    }
}
