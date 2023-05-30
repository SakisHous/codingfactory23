package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * This app decides if the lights for a car should
 * be opened from three variables.
 * if it is raining AND it is raining OR speed >= 100.
 *
 * stdin three variables from user
 * stdout true or false
 * @author Thanasis Chousiadas
 */
public class LightOnApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Please insert if it is raining");
        isRaining = sc.nextBoolean();
        System.out.println("Please insert if it is dark");
        isDark = sc.nextBoolean();
        System.out.println("Please insert car speed");
        speed = sc.nextInt();

        isRunning = (speed >= MAX_SPEED);
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights on: " + lightsOn);

    }
}
