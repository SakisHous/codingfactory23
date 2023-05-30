package gr.aueb.cf.ch5;


import java.util.Scanner;

/**
 * This class implements a simple
 * calculator (+, -, *, /, %).
 * It shows a menu for the user and gets the
 * values for the arithmetic operator, num1 and
 * num2 and outputs the result.
 *
 * @author Thanasis Chousiadas
 */
public class CalculatorApp {

    static Scanner sc = new Scanner(System.in);   // εμβέλεια σε όλες τις μεθόδους της κλάσης!

    public static void main(String[] args) {
        int choice;
        int result;

        do {
            printMenu();
            choice = getNextInt("Please insert your choice");
            if (isChoiceInvalid(choice)) {
                System.out.println("Choice is invalid.");
                continue;
            }

            if (isChoiceQuit(choice)) {
                System.out.println("You chose quit.");
                break;
            }

            result = onChoiceGetResult(choice);
            System.out.println("Result: " + result);
        } while(true);
    }

    public static void printMenu() {
        System.out.println("Please choose an option:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Quit");
    }

    public static int getNextInt(String s) {
        System.out.println(s);
        return sc.nextInt();
    }

    public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice > 6;               // choice is invalid, return true
    }

    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }

    public static int add(int num1 , int num2) {
        return num1 + num2;
    }

    public static int sub(int num1 , int num2) {
        return num1 - num2;
    }

    public static int mul(int num1 , int num2) {
        return num1 * num2;
    }

    public static int div(int num1 , int num2) {
        if (num2 == 0) {
           return Integer.MAX_VALUE;
        }
        return num1 / num2;
    }

    public static int mod(int num1 , int num2) {
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 % num2;
    }

    public static int onChoiceGetResult(int choice) {
        int num1 = getNextInt("Please insert the first number: ");
        int num2 = getNextInt("Please insert the second number: ");
        int result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            case 6:
            default:
                break;
        }

        return result;
    }
}
