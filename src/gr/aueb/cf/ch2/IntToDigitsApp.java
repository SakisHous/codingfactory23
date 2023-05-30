package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * This app convert a two digit integer
 * and computes the sum of these digits.
 * stdin two digits integer
 * stdout integer
 * @author Thanasis Chousiadas
 */
public class IntToDigitsApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int leftDigit = 0;
        int rightDigit = 0;
        int sumOfDigits = 0;

        System.out.println("Please insert a num with two digits:");
        num = sc.nextInt();

        leftDigit = num / 10;
        rightDigit = num / 10;
        sumOfDigits = leftDigit + rightDigit;

        System.out.printf("Num: %d has sum of digits %d", num, sumOfDigits);
    }
}
