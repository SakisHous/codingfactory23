package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * This app calculate if weather is snowing
 * when it is raining and temperature is below 0.
 *
 * @author Thanasis Chousiadas
 */
public class SnowingApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int inputTemp = 0;

        System.out.println("Please insert if it raining:");
        isRaining = sc.nextBoolean();
        System.out.println("Please insert current temperature:");
        inputTemp = sc.nextInt();

        isSnowing = (inputTemp < 0) && isRaining;

        System.out.println("Is snowing: " + isSnowing);
    }
}
