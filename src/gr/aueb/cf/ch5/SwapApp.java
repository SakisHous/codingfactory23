package gr.aueb.cf.ch5;

/**
 * This app swaps values for two variables
 * given by user.
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);

        System.out.println("a = " + a + ", b = " + b);
    }


    /**
     * Swap a, b, s= a -> b, b -> a.
     * @param a     the fist value.
     * @param b     the second value.
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
