package gr.aueb.cf.testbed8;

import java.util.Scanner;

/**
 * This app implements a simple menu.
 *
 * @author Thanasis Chousiadas
 */
public class MenuApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = -1;
        do {
            printMenu();
            choice = getChoice();
            try {
                if (choice == 5) {
                    quit = true;
                } else {
                    printChoice(choice);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice");
            }
        } while(!quit);

    }

    public static void printMenu() {
        System.out.println("Please select one of the following: ");
        System.out.println("1. Insert");
        System.out.println("2. Update");
        System.out.println("3. Delete");
        System.out.println("4. Select");
        System.out.println("5. Exit");
    }

    public static int getChoice() {
        return sc.hasNextInt() ? sc.nextInt() : -1;
    }

    public static void printChoice(int choice) {

        try {
            switch (choice){
                case 1:
                    System.out.println("Inserted");
                    break;
                case 2:
                    System.out.println("Updated");
                    break;
                case 3:
                    System.out.println("Deleted");
                    break;
                case 4:
                    System.out.println("Selected");
                    break;
                default:
                    throw new IllegalArgumentException();
            }

        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
