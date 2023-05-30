package gr.aueb.cf.ch10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class MobileContactsApp {

    final static Scanner sc = new Scanner(System.in);
    final static String[][] contacts = new String[500][3];      // το reference είναι final όχι τα περιεχόμενα
    static int pivot = -1;                                      // 0 δείχνει την τελευταια εγγραφή
    final static Path path = Paths.get("C:/jtmp/log-mobile.txt");

    public static void main(String[] args) {
        boolean quit = false;
        String s;
        int choice;
        String phoneNumber;

        do {
            printMenu();
            s = getChoice();
            if (s.matches("[qQ]")) quit = true;
            else {
                try {
                    choice = Integer.parseInt(s);

                    if (!isValid(choice)) {
                        throw new IllegalArgumentException("Error - Choice must be between 1 - 5");
                    }

                    switch (choice) {
                        case 1:
                            printContactMenu();
                            insertController(getFirstname(), getLastname(), getPhoneNumber());
                            System.out.println("Valid insert");
                            break;
                        case 2:
                            phoneNumber = getPhoneNumber();
                            deleteController(phoneNumber);
                            System.out.println("Valid deletion");
                            break;
                        case 3:
                            phoneNumber = getPhoneNumber();
                            printContactMenu();
                            updateController(phoneNumber, getFirstname(), getLastname(), getPhoneNumber());
                            System.out.println("Valid update");
                            break;
                        case 4:
                            phoneNumber = getPhoneNumber();
                            String[] contact = getOneController(phoneNumber);
                            printContact(contact);
                            break;
                        case 5:
                            String[][] allContacts = getAllContactsController();
                            printAllContacts(allContacts);
                            break;
                        default:
                            throw new IllegalArgumentException("Bad choice");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        } while (!quit);
    }

    public static void printContact(String[] contact) {
        for (String s : contact) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void printAllContacts(String[][] allContacts) {
        for (String[] contact : allContacts) {
            printContact(contact);
//            System.out.printf("%s   %s    %s", contact[0], contact[1], contact[2]);
        }
    }

    public static boolean isValid(int choice) {
        return (choice >= 1) && (choice <= 5);
    }

    public static void printMenu() {
        System.out.println("Choose one of the following:");
        System.out.println("1. Insert contact");
        System.out.println("2. Delete contact");
        System.out.println("3. Update contact");
        System.out.println("4. Search contact");
        System.out.println("5. Print all contacts");
        System.out.println("Q. Exit");
    }

    public static String getChoice() {
        System.out.println("Insert choice");
        return sc.nextLine().trim();
    }

    public static void printContactMenu() {
        System.out.println("Insert firstname, lastname and phone number");
    }

    public static String getFirstname() {
        System.out.println("Insert firstname");
        return sc.nextLine().trim();
    }
    public static String getLastname() {
        System.out.println("Insert lastname");
        return sc.nextLine().trim();
    }
    public static String getPhoneNumber() {
        System.out.println("Insert phone number");
        return sc.nextLine().trim();
    }

    /*
     * Controllers
     */

    public static void insertController(String firstname, String lastname, String phoneNumber) {
        try {
            if (firstname == null || lastname == null || phoneNumber == null) {
                throw new IllegalArgumentException("Nulls are not allowed");
            }

            if (firstname.length() < 2 || firstname.length() > 50 ) {
                throw new IllegalArgumentException("Firstname is not valid");
            }

            if (lastname.length() < 2 || lastname.length() > 50 ) {
                throw new IllegalArgumentException("Lastname is not valid");
            }

            if (phoneNumber.length() < 2 || phoneNumber.length() > 12 ) {
                throw new IllegalArgumentException("Phone number is not valid");
            }

            // Service call
            insertContactService(firstname.trim(), lastname.trim(), phoneNumber.trim());

        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            throw e;
        }
    }

    public static void updateController(String oldPhoneNumber, String firstname, String lastname, String newPhoneNumber) {

        // Validation
        try {
            if (oldPhoneNumber == null ||firstname == null || lastname == null || newPhoneNumber == null) {
                throw new IllegalArgumentException("Nulls are not allowed");
            }

            if (oldPhoneNumber.length() < 2 || oldPhoneNumber.length() > 12 ) {
                throw new IllegalArgumentException("Old phone number is not valid");
            }

            if (firstname.length() < 2 || firstname.length() > 50 ) {
                throw new IllegalArgumentException("Firstname is not valid");
            }

            if (lastname.length() < 2 || lastname.length() > 50 ) {
                throw new IllegalArgumentException("Lastname is not valid");
            }

            if (newPhoneNumber.length() < 2 || newPhoneNumber.length() > 12 ) {
                throw new IllegalArgumentException("New phone number is not valid");
            }

            // Service call
            updateContactService(oldPhoneNumber.trim(), firstname.trim(),
                    lastname.trim(), newPhoneNumber.trim());

        } catch (IllegalArgumentException e) {
           // e.printStackTrace();
            throw e;
        }
    }

    public static String[] deleteController(String phoneNumber) {
        try {
            if (phoneNumber.length() < 2 || phoneNumber.length() > 12 ) {
                throw new IllegalArgumentException("Phone number is not valid");
            }
            return deleteContactService(phoneNumber);
        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            throw e;
        }
    }

    public static String[] getOneController(String phoneNumber) {
        try {
            if (phoneNumber.length() < 2 || phoneNumber.length() > 12 ) {
                throw new IllegalArgumentException("Phone number is not valid");
            }
            return getOneContactService(phoneNumber);
        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            throw e;
        }
    }

    public static String[][] getAllContactsController() {
        try {
            return getAllContactsService();
        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            throw e;
        }
    }

    /*
     * Service Layer
     */

    public static String[] getOneContactService(String phoneNumber) {
        try {
            String[] contact = getContactByPhoneNumber(phoneNumber);
            if (contact.length == 0) {
                throw new IllegalArgumentException("Contact not found");
            }
            return contact;
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }

    }

    public static String[][] getAllContactsService() {
        try {
            String[][] contactsList = getAllContacts();
            if (contactsList.length == 0) {
                throw new IllegalArgumentException("List is empty");
            }
            return contactsList;
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }

    }

    public static void insertContactService(String firstname, String lastname, String phoneNumber) {
        try {
            if (!insert(firstname, lastname, phoneNumber)) {
                throw new IllegalArgumentException("Error in insert");
            }
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static void updateContactService(String oldPhoneNumber, String firstname,
                                            String lastname, String newPhoneNumber) {

        try {
            if (!update(oldPhoneNumber, firstname, lastname, newPhoneNumber)) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static String[] deleteContactService(String phoneNumber) {
        try {
            String[] contact = delete(phoneNumber);

            if (contact.length == 0) {
                throw new IllegalArgumentException("Error in delete");
            }
            return contact;
        } catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    /*
     * CRUD Services that are provided to Services Layer.
     */

    public static int getIndexByPhoneNumber(String phoneNumber) {

        for (int i = 0; i <= pivot; i++) {
            if (contacts[i][2] == phoneNumber) {
                return i;
            }
        }

        return -1;              // if not found
    }

    public static boolean insert(String firstname, String lastname, String phoneNumber) {

        if (isFull(contacts)) return false;

        if (getIndexByPhoneNumber(phoneNumber) != -1) {
            return false;
        }

        pivot++;
        contacts[pivot][0] = firstname;
        contacts[pivot][1] = lastname;
        contacts[pivot][2] = phoneNumber;

        return true;
    }

    public static boolean update(String oldPhoneNumber, String firstname, String lastname, String newPhoneNumber) {
        int posToUpdate = getIndexByPhoneNumber(oldPhoneNumber);

        if (posToUpdate == -1) return false;

        contacts[posToUpdate][0] = firstname;
        contacts[posToUpdate][1] = lastname;
        contacts[posToUpdate][2] = newPhoneNumber;

        return true;
    }

//    public static String[] update(String oldPhoneNumber, String firstname, String lastname, String newPhoneNumber) {
//        String[] contact = new String[3];
//        int posToUpdate = getIndexByPhoneNumber(oldPhoneNumber);
//
//        if (posToUpdate == -1) return new String[] {};      // empty String array for a contact that it is not found
//
//        contact[0] = contacts[posToUpdate][0];
//        contact[1] = contacts[posToUpdate][1];
//        contact[2] = contacts[posToUpdate][2];
//
//        contacts[posToUpdate][0] = firstname;
//        contacts[posToUpdate][1] = lastname;
//        contacts[posToUpdate][2] = newPhoneNumber;
//
//        return contact;
//    }

    public static String[] delete(String phoneNumber) {
        int positionToDelete = getIndexByPhoneNumber(phoneNumber);
        String[] contact = new String[3];

        if (positionToDelete == -1) return new String[] {};

        for (int i = 0; i < contact.length; i++) {
            contact[i] = contacts[positionToDelete][i];
        }

        System.arraycopy(contacts[positionToDelete], 0, contact, 0, contact.length);

        if (!(positionToDelete == contacts.length - 1)) {
            System.arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - positionToDelete);
        }

        pivot--;
        return contact;
    }

    public static String[] getContactByPhoneNumber(String phoneNumber) {
        int positionToReturn = getIndexByPhoneNumber(phoneNumber);

        if (positionToReturn == -1) return new String[] {};

        return contacts[positionToReturn];
    }

    public static String[][] getAllContacts() {
        return Arrays.copyOf(contacts, pivot + 1);      // ο pivot δείχνει στην τελευταία επαφή επιστρεφουμε +1
}                                                                 // γτ είναι το 0 στον πίνακα

    public static boolean isFull(String[][] arr) {
        return pivot == arr.length - 1;
    }

    /**
     * Custom logger.
     *
     * @param e         Exception
     * @param message   Varargs Sting message
     */
    public static void log(Exception e, String... message) {
        try (PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(), true))) {
            ps.println(LocalDateTime.now() + "\n" + e.toString());
            ps.printf("%s", (message.length == 1) ? message[0] : "");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
