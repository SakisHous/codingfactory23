package gr.aueb.cf.ch5;


import java.util.Scanner;

/**
 * This app computes a ^ n.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int result;

        System.out.println("Please insert a, b for a^b");
        a = sc.nextInt();
        b = sc.nextInt();

        result = pow(a, b);

        System.out.printf("%d ^ %d = %d", a, b, result);
    }

    /**
     * Computes the power of an integer.
     *
     * @param a     the base.
     * @param b     the power to raise.
     * @return      the power a ^ b.
     */
    public static int pow(int a, int b) {
        int power = 1;

        for (int i = 1; i <= b; i++) {
            power *= a;
        }
        return power;
    }
}
