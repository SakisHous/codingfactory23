package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyResourceApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        try (sc) {
            System.out.println("Please insert an int");
            num = sc.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            //e.printStackTrace();
            System.out.println("Error.");
        }
    }
}
