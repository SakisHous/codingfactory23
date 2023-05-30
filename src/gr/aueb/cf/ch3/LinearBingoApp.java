package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Linearized if-then-else.
 */
public class LinearBingoApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        final int SECRET = 118;

        while (true) {
            System.out.println("Please provide a secret num:");
            num = sc.nextInt();

            if (num != SECRET) {
                System.out.println("Please try again!!!");
                continue;
            }

            System.out.println("Bingo!!!");
            break;
        }
    }
}
