package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * This app reads a char with
 * Scanner class
 */
public class CharScannerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inputChar;

        System.out.println("Please insert a char");
        inputChar = sc.next().charAt(0);

        System.out.println("char: " + inputChar);
    }
}
