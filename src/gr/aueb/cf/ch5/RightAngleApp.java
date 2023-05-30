package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * This app takes three inputs from the user
 * a, b, and c where c is hypotenuse.
 *
 * It checks if
 * a*a + b*b - c8c <= EPSILON
 *
 * where EPSILON = 0.000005
 */
public class RightAngleApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;

        System.out.println("Please give a, b and c");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        boolean isRight = false;

        isRight = Math.abs(a * a + b * b - c * c) <= EPSILON;

        System.out.println("Right triangle: " + isRight);
    }
}
