package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * This app computes the * - / %
 * of two integers given by user.
 */
public class CalculatorApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Please insert two digits:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Sub: " + (num1 - num2));
        System.out.println("Mul: " + (num1 * num2));
        System.out.println("Div: " + (num1 / num2));
        System.out.println("Mod: " + (num1 % num2));
    }
}
