package gr.aueb.cf.ch7;

import java.util.Scanner;

public class CompareApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "Athens";
        String s2 = "athens";

        if (s1.compareTo(s2) < 0) {
            System.out.println("s1 less than s2");
        } else if (s1.compareTo(s2) > 0) {
            System.out.println("s2 greater than s1");
        } else {
            System.out.println("Equals");
        }


    }
}
