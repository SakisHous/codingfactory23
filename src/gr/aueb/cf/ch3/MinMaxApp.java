package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Finds min and max from two numbers that
 * they are provided by user.
 */
public class MinMaxApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;
        int max = 0;

        System.out.println("Please provide two ints:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 < num2) {
            min = num1;
            max = num2;
        } else if (num1 > num2){
            min = num1;
            max = num1;
        } else {
            System.out.println("Numbers are equal!");
        }

        if (num1 != num2) {
            System.out.println("Min: " + min);
            System.out.println("Max " + max);
        }
    }
}
