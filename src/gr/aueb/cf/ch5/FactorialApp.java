package gr.aueb.cf.ch5;

import java.util.Locale;
import java.util.Scanner;

/**
 * This app computes n factorial
 * using facto() method.
 *
 * @author Thanasis Chousiadas
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int result;

        System.out.println("Please insert a number for factorial");
        n = sc.nextInt();

        result = facto(n);
        System.out.printf(Locale.US, "%d! = %,d", n, result);

    }

    /**
     * Computes factorial n!.
     *
     * @param n     the number (n) of n!.
     * @return      1 * 2 * 3 * 4 * ... *n.
     */
    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
