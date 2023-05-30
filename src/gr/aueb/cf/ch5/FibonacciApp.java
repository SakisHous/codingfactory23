package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * This app computes Fibonacci
 * sequence using recursive technique.
 */
public class FibonacciApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int result;

        System.out.println("Please insert n for Fibonacci sequence");
        n = sc.nextInt();

        result = fib(n);
        System.out.printf("The %dth term of sequence is %d", n, result);
    }

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fib(n-1) + fib(n-2);
    }
}
