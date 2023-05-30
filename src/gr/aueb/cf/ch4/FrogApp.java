package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * A frog has to pass a small river. Frog is
 * located at x. It has to reach at y or
 * at a location >=y. Frog jumps a fix distance, D.
 * This app finds the min jumps that the frog should
 * take to reach in a distance >= y.
 * For example,
 * X = 10
 * Y = 85
 * D = 30
 *
 */
public class FrogApp {

    public static void main(String[] args) {
        int x = 10;
        int y = 85;
        int jmp = 30;
        int jumps;

        jumps = (int) Math.ceil((y - x) / (double) jmp);

        System.out.println("Number of jumps " + jumps);
    }
}
