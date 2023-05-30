package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Computes the square and cubic power of
 * an integer, given by user.
 */
public class MathPowersApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please insert an integer to compute the squared and cubic power:");
        inputNum = sc.nextInt();

        System.out.printf(Locale.US,"num: %d, square: %,d, cubic: %,d",
                inputNum, (int) Math.pow(inputNum, 2), (int) Math.pow(inputNum, 3));
    }
}
