package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * It keeps reading until a sentinel value
 * is provides.
 */
public class SentinelApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please give a number: ");
        num = sc.nextInt();

        while (num != 0) {
//            System.out.println(num);
            iterations++;
            System.out.println("Please provide a num");
            num = sc.nextInt();
        }

        System.out.printf("%d iterations", iterations);
    }
}
