package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while (true) {
            try {
                System.out.println("Please insert a num");

                inputNum = sc.nextInt();

                if (inputNum == MAGIC_NUM) {
                    System.out.println("Magic Number found.");
                    break;
                }
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("ERROR! You have to insert an integer.");
            }

            // using state testing to avoid try-catch see version 2

        }

        System.out.println("Thanks for using magic app.");
    }
}
