package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * This app computes if fuels from an airplane
 * from two tanks are below 1/4 it outputs red signal.
 * If a tank is only below 1/4 then orange signal.
 *
 * @author Thanasis Chousiadas
 */
public class OrangeRedSignalApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tank 1, tank 2 are less than 1/4");
        isTank1LTQuarter = sc.nextBoolean();
        isTank2LTQuarter = sc.nextBoolean();

        orangeOn = isTank1LTQuarter || isTank2LTQuarter;
        redOn = isTank1LTQuarter && isTank2LTQuarter;

        System.out.println("Orange on: " + orangeOn);
        System.out.println("Red on: " + redOn);
    }
}
