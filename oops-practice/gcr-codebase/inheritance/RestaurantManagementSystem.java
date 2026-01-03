public class RestaurantManagementSystem {
    public static void main(String[] args) {

        Worker w1 = new Chef("C101", "Ravi");
        Worker w2 = new Waiter("W201", "Aman");

        w1.performDuties();
        w2.performDuties();
    }
}

interface Worker {
    void performDuties();
}

class Person {
    String id;
    String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Chef extends Person implements Worker {

    public Chef(String id, String name) {
        super(id, name);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is preparing food");
    }
}

class Waiter extends Person implements Worker {

    public Waiter(String id, String name) {
        super(id, name);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter is serving food");
    }
}
