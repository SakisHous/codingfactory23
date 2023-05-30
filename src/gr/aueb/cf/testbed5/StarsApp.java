package gr.aueb.cf.testbed5;

import java.util.Scanner;

/**
 * This app prints N stars in five different patterns,
 * horizontally, vertically, NxN, 1 to N and N to 1,
 * where N and choice is given by the user.
 *
 * @author Thanasis Chousiadas
 */
public class StarsApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int n = 0;

        do {
            printMenu();
            choice = getNextInt("Δώστε επιλογή");
            if (isChoiceInvalid(choice)) {
                System.out.println("Μη έγκυρη τιμή");
                continue;
            }
            if (isChoiceQuit(choice)) {
                System.out.println("Διαλέξατε έξοδο");
                break;
            }

            n = getNumberOfStars();
            onChoicePrintStars(choice, n);
        } while(true);

    }

    /**
     * Prints the main menu.
     */
    public static void printMenu() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με 1-n αστεράκια");
        System.out.println("5. Εμφάνισε n γραμμές με n-1 αστεράκια");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    /**
     * Asks from user the input.
     * @param s     the message to be displayed for the right input.
     * @return      an integer.
     */
    public static int getNextInt(String s) {
        System.out.println(s);
        return sc.nextInt();
    }

    /**
     * Checks if choice is invalid
     * @param choice        the choice given by the user.
     * @return              true if invalid otherwise false.
     */
    public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice > 6;
    }

    /**
     * Asks for the number of stars (n)
     * and checks if it is a non-negative number.
     * @return              number of stars (n).
     */
    public static int getNumberOfStars() {
        int n = 0;
        n = getNextInt("Δώστε αριθμό για τα αστεράκια.");
        do {
            if (n < 0) {
                n = getNextInt("Δώστε έναν μη αρνητικό ακέραιο αριθμό.");
            } else {
                break;
            }
        } while(true);
        return n;
    }

    /**
     * Checks if user choose exit.
     * @param choice        the choice given by the user.
     * @return              true for exit otherwise false.
     */
    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }

    /**
     * Checks the choice given by the user and call
     * the right method.
     * @param choice        the choice given by the user.
     * @param n             number of stars.
     */
    public static void onChoicePrintStars(int choice, int n) {

        switch (choice) {
            case 1:
                starsHorizontal(n);
                break;
            case 2:
                starsVertical(n);
                break;
            case 3:
                starsNxN(n);
                break;
            case 4:
                starsAscN(n);
                break;
            case 5:
                starsDescN(n);
                break;
            case 6:
            default:
                break;
        }
    }

    /**
     * Prints n stars horizontally.
     * @param n         number of stars.
     */
    public static void starsHorizontal(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * Prints n stars vertically.
     * @param n     number of stars.
     */
    public static void starsVertical(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    /**
     * Prints N stars vertically and N stars horizontally.
     * @param n     number of stars.
     */
    public static void starsNxN(int n) {
        for (int i = 1; i <= n; i++) {
            starsHorizontal(n);
        }
    }

    /**
     * Prints the number of stars in ascending
     * from 1 to n in each line.
     * @param n     number of stars.
     */
    public static void starsAscN(int n) {
        for (int i = 1; i <= n; i++) {
            starsHorizontal(i);
        }
    }

    /**
     * Prints the number of stars in descending
     * from n to 1 in each line.
     * @param n     number of stars.
     */
    public static void starsDescN(int n) {
        for (int i = n; i >= 1; i--) {
            starsHorizontal(i);
        }
    }
}
