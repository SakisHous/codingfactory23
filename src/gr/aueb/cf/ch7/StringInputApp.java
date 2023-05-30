package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringInputApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;

        System.out.println("Please provide a string");
        //s = sc.next();      // ends with whitespaces (spaces, tab \t, new line (enter) \n)
        s = sc.nextLine();

        System.out.print(s);
    }
}
