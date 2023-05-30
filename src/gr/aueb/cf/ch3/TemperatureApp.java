package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * This app decides if it is snowing
 * when temperature is below zero celsius
 * otherwise it is not snowing.
 *
 * @author Thanasis Chousiadas
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputTemp = 0;
        boolean isSnowing = false;

        System.out.println("Please insert current temperature:");
        inputTemp = sc.nextInt();

        isSnowing = (inputTemp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
