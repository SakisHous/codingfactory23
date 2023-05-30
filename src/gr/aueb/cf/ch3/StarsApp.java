package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * This app prints n-stars,
 * where n is given by user.
 */
public class StarsApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStars = 0;
        int i = 1;

        System.out.println("Please insert the number of stars");
        numberOfStars = sc.nextInt();

        while (i <= numberOfStars) {
            System.out.print("*");

            if (i % 50 == 0) {
                System.out.println("");
            }
            i++;
        }
    }
}
