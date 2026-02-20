import java.util.*;

public class Doctor {
    private String name;
    private String specialization;
    private List<String> availableSlots;
    private List<Appointment> history = new ArrayList<>();

    public Doctor(String name, String specialization, List<String> slots) {
        this.name = name;
        this.specialization = specialization;
        this.availableSlots = new ArrayList<>(slots);
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getName() {
        return name;
    }

    public void book(String patient, String slot) throws SlotUnavailableException {
        if (!availableSlots.contains(slot))
            throw new SlotUnavailableException("Slot not available for Dr." + name);

        availableSlots.remove(slot);
        history.add(new Appointment(patient, slot));
    }

    public List<Appointment> getHistory() {
        return history;
    }
}
