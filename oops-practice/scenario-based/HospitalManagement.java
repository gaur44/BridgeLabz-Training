interface IPayable {
    double calculateBill();
}

abstract class Patient {
    protected int id;
    protected String name;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void displayInfo();
}

class InPatient extends Patient {
    protected int days;

    public InPatient(int id, String name, int days) {
        super(id, name);
        this.days = days;
    }

    public void displayInfo() {
        System.out.println("InPatient: " + name);
    }
}

class OutPatient extends Patient {
    Doctor supervisingDoctor;

    public OutPatient(int id, String name, Doctor supervisingDoctor) {
        super(id, name);
        this.supervisingDoctor = supervisingDoctor;
    }

    public void displayInfo() {
        System.out.println("OutPatient: " + name);
    }
}

class Doctor {
    protected int doctorId;
    protected String name;

    public Doctor(int id, String name) {
        this.doctorId = id;
        this.name = name;
    }
}

class Bill implements IPayable {
    protected int billId;
    protected double amount;

    public Bill(int id, double amount) {
        this.billId = id;
        this.amount = amount;
    }

    public double calculateBill() {
        return amount;
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Doctor d1 = new Doctor(1, "Dr. Singh");

        // CREATE
        Patient p1 = new InPatient(1, "Rahul", 3);
        Patient p2 = new OutPatient(2, "Anita", d1);

        Bill b1 = new Bill(101, 3000);
        Bill b2 = new Bill(102, 500);

        // READ
        p1.displayInfo();
        System.out.println(b1.calculateBill());

        p2.displayInfo();
        System.out.println(b2.calculateBill());

        // UPDATE
        b2 = new Bill(102, 700);

        // DELETE
        p1 = null;

    }
}
