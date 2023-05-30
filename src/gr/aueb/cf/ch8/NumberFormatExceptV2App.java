package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatExceptV2App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = "";
        int inputNum = 0;


        System.out.println("Please insert an int");
        inputStr = sc.nextLine();
        if (isInt(inputStr)) {
            inputNum = Integer.parseInt(inputStr);
            System.out.println("Input num: " + inputNum);
        } else {
            System.out.println("Error in input.");
        }



    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
