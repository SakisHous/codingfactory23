package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts euros to american dollars
 * stdin int from keyboard
 * stdout the value in US dollars
 *
 * @author Thanasis Chousiadas
 */
public class EuroToUsdConverterApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 108;

        System.out.println("Please insert an amount (in Euros):");
        inputEuros = sc.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        // stdout the results
        System.out.printf("%d euros = %d USA dollars, %d USA cents", inputEuros, usaDollars, usaCents);
    }
}
