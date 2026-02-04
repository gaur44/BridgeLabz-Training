import java.util.*;

class Patient {
    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getId() {
        return id;
    }
}

public class PatientIDPrint {
    public static void main(String[] args) {

        List<Patient> patients = Arrays.asList(
            new Patient(101, "Aman"),
            new Patient(102, "Agraj"),
            new Patient(103, "Harsh")
        );

        // print patient IDs using method reference
        patients.stream()
                .map(Patient::getId)
                .forEach(System.out::println);
    }
}
