package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * This app finds the max int from three
 * integers given by user
 * stdin three ints
 * stdout max int
 * @author Thanasis Chousiadas
 */
public class MaxOfThreeInts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;

        System.out.println("Please insert three integers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        System.out.printf("Max integer is %d", Math.max(num1, Math.max(num2, num3)));
    }
}
