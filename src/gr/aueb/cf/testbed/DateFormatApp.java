package gr.aueb.cf.testbed;

import java.util.Scanner;

/**
 * This class outputs datetime in the format DD/MM/YY
 * from three integers day, month, year given by user.
 * stdin three integers (day, month, year)
 * stdout string of datetime in format DD/MM/YY
 *
 * @author Thanasis Chousiadas
 */
public class DateFormatApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Please insert three integers for day, month and year:");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        System.out.printf("%02d/%02d/%02d", day, month, year % 100);
    }
}
