package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * This app asks from the user three integers,
 * decreases them by a unit and outputs them
 * in the same order.
 * stdin three ints
 * stdout three ints
 * @author Thanasis Chousiadas
 */
public class ThreeNumbersApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please insert three integers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        // num1 -= 1; num2 -= 1; num3 -=1;
        num1--;
        num2--;
        num3--;

        System.out.printf("Decreased integers %d, %d and %d", num1, num2, num3);
    }
}
