package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Typecast from String to int.
 */
public class TypecastApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lexeme;
        int num;

        System.out.println("Please provide a num(int)");
        lexeme = sc.next();

        num = Integer.parseInt(lexeme);
        System.out.println("Num is " + num);
    }
}
