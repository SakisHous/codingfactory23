package gr.aueb.cf.ch4;

import java.util.Locale;
import java.util.Scanner;

/**
 * This app adds and multiples the first n
 * integers given by user.
 */
public class AddMulApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        int result = 1;

        System.out.println("Please insert a number:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            result = result * i;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + result);
        System.out.printf(Locale.US, "Mul: %,d", result);
    }
}
