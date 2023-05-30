package gr.aueb.cf.ch5;

/**
 * This app computes a ^ b,
 * using recursive technique.
 */
public class PowerRecursiveApp {

    public static void main(String[] args) {
        int a = 2;
        int b = -2;

        System.out.println(power(a, b));

    }

    /**
     *  Recursive of a ^ b.
     *
     * @param a     the base.
     * @param b     the power.
     * @return      the power of a ^ b.
     */
    public static float power(float a, float b) {

        if (b < 0) {
            return 1 / power(a, -b);
        }

        if (b == 0) return 1;

        return a * power(a, b-1);
    }
}
