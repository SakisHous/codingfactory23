package gr.aueb.cf.testbed4;

import java.util.Scanner;

/**
 * This app prints N stars (*)
 * horizontal, where N is given by the
 * user.
 *
 * @author Thanasis Chousiadas
 */
public class StarsHorizontalN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;

        do {
            System.out.println("Please insert N for the number of stars");
            n = sc.nextInt();

            if (n >= 0) break;
            System.out.println("Please insert a valid number");
        } while(true);

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
