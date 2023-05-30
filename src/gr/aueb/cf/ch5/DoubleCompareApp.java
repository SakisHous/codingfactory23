package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * This app compares < > in floating points
 * numbers.
 */
public class DoubleCompareApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d1;
        double d2;
        final double EPSILON = 0.000005;

        System.out.println("Please insert two doubles");
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();

        if (Math.abs(d1 - d2) <= EPSILON) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}
