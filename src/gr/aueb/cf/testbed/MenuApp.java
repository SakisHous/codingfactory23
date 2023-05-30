package gr.aueb.cf.testbed;

import java.util.Scanner;

/**
 * This app outputs a simple menu with
 * five choices and asks for user to choose
 * one each time.
 *
 * @author Thanasis Chousiadas
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            System.out.println("Please insert a number");
            choice = sc.nextInt();

            if (choice <= 0 || choice > 5) {
                System.out.println("Please insert a valid number");
                continue;
            }

            if (choice == 1) {
                System.out.println("Επιλέξατε εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε διαγραφή");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε ενημέρωση");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε αναζήτηση");
            } else {
                System.out.println("Επιλέξατε έξοδος");
            }

        } while (choice != 5);
    }
}
