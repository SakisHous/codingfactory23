package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int result;

        System.out.println("Please provide two ints for division");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

//        Δεν είναι αυτή καλή πρακτική
//        try {
//            result = num1 / num2;
//        } catch (ArithmeticException e) {
//            System.out.println("Error, division with 0.");
//        }

        if (num2 != 0) {
            result = num1 / num2;
            System.out.println(result);
        } else {
            System.out.println("Division with 0 is not allowed.");
        }
    }
}
