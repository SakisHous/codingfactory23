package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * This app computes the number of digits
 * in an integer, the sum of the digits and
 * the sum of the first and last digit.
 * e.g. 53, 2 digits, 8 sum , leftmost + rightmost = 8
 * @author Thanasis Chousiadas
 */
public class DigitApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;
        int sum = 0;
        int sumLeftRight = 0;
        int currentDigit = 0;
        int leftMostDigit = 0;
        int rightMostDigit = 0;

        System.out.println("Please insert num");
        inputNum = sc.nextInt();

        num = inputNum;
        do {
            count++;
            currentDigit = num % 10;
            if (count == 1) {
                rightMostDigit = currentDigit;
            }
            sum += currentDigit;
            num = num /10;
        } while(num != 0);

        leftMostDigit = currentDigit;
        sumLeftRight = leftMostDigit + rightMostDigit;

        System.out.println("Count: " + count);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of leftmost, rightmost digits: " + sumLeftRight);
    }
}
