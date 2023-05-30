package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * This app computes n!
 *
 * @author Thanasis Chousiadas
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long facto = 1L;
        int i = 1;
        int n = 0;

        System.out.println("Please insert n for n!");
        n = sc.nextInt();

        while (i <= n) {
            facto *= i;
            i++;
        }

        System.out.printf("%d! = %,d", n, facto);
    }
}
