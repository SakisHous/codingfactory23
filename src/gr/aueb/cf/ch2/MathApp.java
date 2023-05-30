package gr.aueb.cf.ch2;

/**
 * Demonstrates Math class
 */
public class MathApp {
    public static void main(String[] args) {
        int a = 2;
        int res = 0;
        System.out.println("Το απόλυτο του -5 είναι: " + Math.abs(-5));

        res = (int) Math.pow(2, 12);

        System.out.println("2^12 = " + res);
    }
}
