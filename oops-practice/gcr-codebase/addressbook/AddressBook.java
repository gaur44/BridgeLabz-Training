package addressbook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    /* Add contact with duplicate check */
    public boolean addContact(Contact contact) {
        if (contacts.contains(contact)) {
            return false;
        }
        contacts.add(contact);
        return true;
    }

    /* Edit contact by name */
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

    /* Delete contact */
    public boolean deleteContact(String firstName, String lastName) {
        return contacts.removeIf(c ->
                c.getFirstName().equalsIgnoreCase(firstName)
                        && c.getLastName().equalsIgnoreCase(lastName));
    }

    /* Search by city */
    public List<Contact> searchByCity(String city) {
        return contacts.stream()
                .filter(c -> c.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    /* Search by state */
    public List<Contact> searchByState(String state) {
        return contacts.stream()
                .filter(c -> c.getState().equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }

    /* Sort by name */
    public void sortByName() {
        contacts.sort(Comparator
                .comparing(Contact::getFirstName, String.CASE_INSENSITIVE_ORDER)
                .thenComparing(Contact::getLastName, String.CASE_INSENSITIVE_ORDER));
    }

    /* Sort by city */
    public void sortByCity() {
        contacts.sort(Comparator.comparing(Contact::getCity, String.CASE_INSENSITIVE_ORDER));
    }

    public void displayAll() {
        if (contacts.isEmpty()) {
            System.out.println("Address Book is empty.");
            return;
        }
        contacts.forEach(System.out::println);
    }
}

