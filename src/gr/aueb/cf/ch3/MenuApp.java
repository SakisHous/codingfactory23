package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * This app prints iterative a menu
 * until the user chooses EXIT.
 *
 * @author Thanasis Chousiadas
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please choose one from below");
            System.out.println("1. New product input");
            System.out.println("2. Deleting product");
            System.out.println("3. Exit");
            choice = sc.nextInt();
        } while (choice != 3);
    }
}
