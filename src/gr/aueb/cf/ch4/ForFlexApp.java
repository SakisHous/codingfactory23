package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * This app reads for standard input
 * start value, end value and step
 * and it prints the number of iterations.
 */
public class ForFlexApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startValue;
        int endValue;
        int step;
        int iterations = 0;

        System.out.println("Please provide start, end and step values");
        startValue = sc.nextInt();
        endValue = sc.nextInt();
        step = sc.nextInt();

        for (int i = startValue; i <= endValue; i = i + step) {
            iterations++;
            System.out.print("i=" + i + " ");
        }

        System.out.println();
        System.out.println("Iterations: " + iterations);
    }
}
