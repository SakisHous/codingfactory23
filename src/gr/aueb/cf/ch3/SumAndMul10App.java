package gr.aueb.cf.ch3;

/**
 * This app prints the sum and multiplication
 * of the first 10 integers.
 *
 * @author Thanasis Chousiadas
 */
public class SumAndMul10App {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 0;
        int i = 1;

        while (i <= 10) {
            sum += i;
            mul *= i;
            i++;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);
    }
}
