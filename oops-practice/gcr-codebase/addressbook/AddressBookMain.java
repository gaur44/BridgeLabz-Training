package addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search by City");
            System.out.println("5. Search by State");
            System.out.println("6. Sort by Name");
            System.out.println("7. Display All");
            System.out.println("0. Exit");

            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("First Name: ");
                    String fn = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String ln = scanner.nextLine();
                    System.out.print("Address: ");
                    String address = scanner.nextLine();
                    System.out.print("City: ");
                    String city = scanner.nextLine();
                    System.out.print("State: ");
                    String state = scanner.nextLine();
                    System.out.print("Zip: ");
                    String zip = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    Contact contact = new Contact(fn, ln, address, city, state, zip, phone, email);
                    if (addressBook.addContact(contact)) {
                        System.out.println("Contact added successfully.");
                    } else {
                        System.out.println("Duplicate contact not allowed.");
                    }
                }

                case 2 -> {
                    System.out.print("First Name: ");
                    String fn = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String ln = scanner.nextLine();

                    System.out.print("New Address: ");
                    String address = scanner.nextLine();
                    System.out.print("New City: ");
                    String city = scanner.nextLine();
                    System.out.print("New State: ");
                    String state = scanner.nextLine();
                    System.out.print("New Zip: ");
                    String zip = scanner.nextLine();
                    System.out.print("New Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("New Email: ");
                    String email = scanner.nextLine();

                    if (addressBook.editContact(fn, ln, address, city, state, zip, phone, email)) {
                        System.out.println("Contact updated.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                }

                case 3 -> {
                    System.out.print("First Name: ");
                    String fn = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String ln = scanner.nextLine();

                    if (addressBook.deleteContact(fn, ln)) {
                        System.out.println("Contact deleted.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                }

                case 4 -> {
                    System.out.print("City: ");
                    String city = scanner.nextLine();
                    addressBook.searchByCity(city).forEach(System.out::println);
                }

                case 5 -> {
                    System.out.print("State: ");
                    String state = scanner.nextLine();
                    addressBook.searchByState(state).forEach(System.out::println);
                }

                case 6 -> {
                    addressBook.sortByName();
                    System.out.println("Sorted by name.");
                }

                case 7 -> addressBook.displayAll();

                case 0 -> {
                    System.out.println("Goodbye!");
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}

