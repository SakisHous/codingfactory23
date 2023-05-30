package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptV2App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while (true) {
            System.out.println("Please insert a num");

            if (sc.hasNextInt()) {
                inputNum = sc.nextInt();
            } else {
                sc.nextLine();
                System.out.println("ERROR! You have to insert an integer.");
                continue;
            }

            if (inputNum == MAGIC_NUM) {
                System.out.println("Magic Number found.");
                break;
            }
        }

        System.out.println("Thanks for using magic app.");
    }
}
