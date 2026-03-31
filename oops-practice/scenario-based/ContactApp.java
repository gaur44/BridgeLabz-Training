import java.util.*;

class InvalidPhoneNumberException extends Exception {
    InvalidPhoneNumberException(String m) {
        super(m);
    }
}

class Contact {
    String name;
    String phone;

    Contact(String n, String p) {
        name = n;
        phone = p;
    }
}

public class ContactApp {

    static List<Contact> list = new ArrayList<>();

    static void add(String n, String p) throws InvalidPhoneNumberException {
        if (p.length() != 10)
            throw new InvalidPhoneNumberException("Phone must be 10 digits");

        for (Contact c : list)
            if (c.phone.equals(p)) {
                System.out.println("Already exists");
                return;
            }

        list.add(new Contact(n, p));
        System.out.println("Added");
    }

    static void del(String p) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).phone.equals(p)) {
                list.remove(i);
                System.out.println("Deleted");
                return;
            }
        }
        System.out.println("Not found");
    }

    static void find(String p) {
        for (Contact c : list)
            if (c.phone.equals(p)) {
                System.out.println(c.name + " - " + c.phone);
                return;
            }
        System.out.println("Not found");
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {
            add("Aman", "9876543210");
            add("Rohan", "123");        // wrong phone number
        } catch (InvalidPhoneNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        find("9876543210");
        del("9876543210");
        find("9876543210");
        s.close();
    }
}
