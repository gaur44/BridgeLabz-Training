package addressbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    /* UC 1: Add contact */
    public boolean addContact(Contact contact) {
        if (contacts.contains(contact)) {
            return false;
        }
        contacts.add(contact);
        return true;
    }

    /* UC 3: Edit contact by name */
    public boolean editContact(String firstName, String lastName,
                               String newAddress, String newCity,
                               String newState, String newZip,
                               String newPhone, String newEmail) {

        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName)
                    && c.getLastName().equalsIgnoreCase(lastName)) {

                c.setAddress(newAddress);
                c.setCity(newCity);
                c.setState(newState);
                c.setZip(newZip);
                c.setPhoneNumber(newPhone);
                c.setEmail(newEmail);
                return true;
            }
        }
        return false;
    }

    /* UC 4: Delete contact */
    public boolean deleteContact(String firstName, String lastName) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            Contact c = it.next();
            if (c.getFirstName().equalsIgnoreCase(firstName)
                    && c.getLastName().equalsIgnoreCase(lastName)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* UC 8a: Search by city */
    public List<Contact> searchByCity(String city) {
        List<Contact> result = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getCity().equalsIgnoreCase(city)) {
                result.add(c);
            }
        }
        return result;
    }

    /* UC 8b: Search by state */
    public List<Contact> searchByState(String state) {
        List<Contact> result = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getState().equalsIgnoreCase(state)) {
                result.add(c);
            }
        }
        return result;
    }

    /* UC 11: Sort by name (manual sort) */
    public void sortByName() {
        int n = contacts.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                Contact c1 = contacts.get(j);
                Contact c2 = contacts.get(j + 1);

                int firstNameCompare =
                        c1.getFirstName().compareToIgnoreCase(c2.getFirstName());

                if (firstNameCompare > 0 ||
                   (firstNameCompare == 0 &&
                    c1.getLastName().compareToIgnoreCase(c2.getLastName()) > 0)) {

                    contacts.set(j, c2);
                    contacts.set(j + 1, c1);
                }
            }
        }
    }

    /* UC 12: Sort by city */
    public void sortByCity() {
        int n = contacts.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                Contact c1 = contacts.get(j);
                Contact c2 = contacts.get(j + 1);

                if (c1.getCity().compareToIgnoreCase(c2.getCity()) > 0) {
                    contacts.set(j, c2);
                    contacts.set(j + 1, c1);
                }
            }
        }
    }

    public List<Contact> getContacts() {
        return new ArrayList<>(contacts);
    }

    public void loadContacts(List<Contact> contactList) {
        contacts.clear();
        if (contactList != null) {
            contacts.addAll(contactList);
        }
    }

    public void displayAll() {
        if (contacts.isEmpty()) {
            System.out.println("Address Book is empty.");
            return;
        }

        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
