package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * This app counts the number of
 * positive integers given by user.
 *
 * @author Thanasis Chousiadas
 */
public class PositivesCountApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        System.out.println("Please give a num:");
        num = sc.nextInt();

        while (num >= 0)  {
            positivesCount++;
            System.out.println("Please give another num:");
            num = sc.nextInt();
        }

        System.out.println("Positive-count: " + positivesCount);
    }
}
