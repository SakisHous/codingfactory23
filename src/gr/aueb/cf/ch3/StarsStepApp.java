package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * This app prints stars when the user
 * gives start, step and end.
 *
 * @author Thanasis Chousiadas
 */
public class StarsStepApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        int i = 0;

        System.out.println("Please insert start, end value and step:");
        start = sc.nextInt();
        end = sc.nextInt();
        step = sc.nextInt();

        i = start;
        while (i <= end) {
            System.out.println("*");
            i = i + step;
        }
    }
}
