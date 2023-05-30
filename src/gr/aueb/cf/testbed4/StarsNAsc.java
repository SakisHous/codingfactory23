package gr.aueb.cf.testbed4;

import java.util.Scanner;

/**
 * This app prints N stars in ascending.
 * First line a star, second line 2 stars,
 * third line 3 stars etc.
 *
 * @author Thanasis Chousiadas
 */
public class StarsNAsc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Please insert N for the number of stars");
            n = sc.nextInt();

            if (n >= 0) break;
            System.out.println("Please insert a valid number");
        } while(true);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
