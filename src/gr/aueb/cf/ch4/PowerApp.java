package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * This app computes a^n
 * where a and n are given by user.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int n = 0;
        int result = 1;

        System.out.println("Please insert base and power ");
        a = sc.nextInt();
        n =sc.nextInt();

        for (int i = 1; i <= n; i++) {
            result *= a;
        }

        System.out.println("Result: " + result);
    }
}
