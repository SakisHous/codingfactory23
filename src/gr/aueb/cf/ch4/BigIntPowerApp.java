package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

/**
 * This app computes a^b using BigInteger class,
 * where a and n are given by user.
 */
public class BigIntPowerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a;
        BigInteger b;
        BigInteger result = new BigInteger("1");

        System.out.println("Please insert base and power");
        a = BigInteger.valueOf(sc.nextInt());
        b = BigInteger.valueOf(sc.nextInt());

        for (int i = 1; i <= b.intValue(); i++) {
            result = result.multiply(a);
        }

        System.out.printf(Locale.US, "%d^%d = %,d", a, b, result);
    }
}
