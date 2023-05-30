package gr.aueb.cf.ch5;


import java.util.Scanner;

/**
 * This app decides if an integers
 * is even or odd.
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean isNumEven = false;

        System.out.println("Please insert an integer");
        num = sc.nextInt();

        isNumEven = isEven(num);

        System.out.println("Num " + num + " is even: " + isNumEven);
    }

    /**
     * Checks if an integer is even.
     *
     * @param n     An integer to be checked.
     * @return      True (if n is even) / false (if n is not even).
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
//        if (n % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
