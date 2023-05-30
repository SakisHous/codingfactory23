package gr.aueb.cf.testbed;

import java.util.Scanner;

public class DemoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();  // το in είναι Scanner
        boolean result;

        if ((num % 2) ==  0) {
            if (num > 10) {
                result = true;
            } else {
                result = false;
            }
        } else {
            result = false;
        }

        System.out.println(result);
    }
}
