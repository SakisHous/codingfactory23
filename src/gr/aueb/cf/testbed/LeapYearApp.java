package gr.aueb.cf.testbed;

import java.util.Scanner;

/**
 * This app computes if a year that is given
 * by the user is a leap year (366 days) or
 * just a year (365 days).
 *
 * @author Thanasis Chousiadas
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputYear = 0;

        System.out.println("Please insert a year:");
        inputYear = sc.nextInt();

        if ((inputYear % 4) != 0){
            System.out.printf("%d is not a leap year", inputYear);
        } else if ((inputYear % 100) != 0) {
            System.out.printf("%d is a leap year", inputYear);
        } else if ((inputYear % 400) != 0) {
            System.out.printf("%d is not a leap year", inputYear);
        } else {
            System.out.printf("%d is a leap year", inputYear);
        }
    }
}
