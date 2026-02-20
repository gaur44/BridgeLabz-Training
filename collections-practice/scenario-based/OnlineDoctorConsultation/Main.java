import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scheduler s = new Scheduler();

        Doctor d1 = new Doctor("Agraj", "Cardio", List.of("10AM","11AM"));
        Doctor d2 = new Doctor("John", "Cardio", List.of("12PM"));

        s.addDoctor(d1);
        s.addDoctor(d2);

        try {
            s.book("Cardio","Agraj","Aman","10AM");
            s.book("Cardio","Agraj","Amit","10AM");
        } catch (SlotUnavailableException e) {
            System.out.println(e.getMessage());
        }

        s.showHistory("Cardio");
    }
}
