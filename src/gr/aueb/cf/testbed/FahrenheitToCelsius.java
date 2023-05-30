package gr.aueb.cf.testbed;

import java.util.Scanner;

/**
 * This class converts Fahrenheit degrees (integer),
 *  given by user to Celsius degrees (integer).
 *  stdin an integer
 *  stdout celsius degrees
 *
 * @author Thanasis Chousiadas
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputFahrenheit= 0;
        int celsius = 0;

        System.out.println("Please insert an integer (Fahrenheit degrees): ");
        inputFahrenheit = sc.nextInt();

        celsius = (5 * (inputFahrenheit - 32)/ 9);

        System.out.printf("%d \u2109 = %d \u2103", inputFahrenheit, celsius);
    }
}
