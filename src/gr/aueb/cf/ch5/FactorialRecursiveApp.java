package gr.aueb.cf.ch5;

import java.util.Locale;
import java.util.Scanner;

/**
 * This app computes factorial using
 * recursive technique.
 */
public class FactorialRecursiveApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert a number");
        num = sc.nextInt();

        System.out.printf(Locale.US,"%d! = %,d", num, facto(num));

    }

    /**
     * Recursive solution of n!.
     * @param n     n of n!.
     * @return      n!.
     */
    public static int facto(int n) {
//        if (n <= 1) return 1;
//        return n * fact(n-1);
        return (n <= 1) ? 1 : n * facto(n-1);
    }
}
