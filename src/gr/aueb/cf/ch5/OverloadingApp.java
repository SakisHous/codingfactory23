package gr.aueb.cf.ch5;

/**
 * Overloading methods
 */
public class OverloadingApp {

    public static void main(String[] args) {
        System.out.println(add( 3, 4));
        System.out.println(add(2, 43, 76));
        System.out.println(add(34L, 34));
        System.out.println(add(90L, 87L));
        System.out.println(add(3.456, 89.76));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static long add(long a, int b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
