package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Reads from std input two integers and add them
 */
public class ScannerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Give two numbers for adding them... ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        result = num1 + num2;

        System.out.println("Sum: " + result);
    }
}
