package gr.aueb.cf.ch3;

import java.util.Locale;
import java.util.Scanner;

/**
 * This app computes a^b
 *
 * @author Thanasis Chousiadas
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 1;
        int i = 1;

        System.out.println("Please insert a , b for a^b:");
        a = sc.nextInt();
        b = sc.nextInt();

        while (i <= b) {
            result *= a;
            i++;
        }

        System.out.printf(Locale.US, "%d^%d = %,d", a, b , result);
    }
}
