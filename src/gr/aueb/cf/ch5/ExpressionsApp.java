package gr.aueb.cf.ch5;

import java.util.Locale;

public class ExpressionsApp {

    public static void main(String[] args) {
        double num1 = 12345678.5;
        double num2 = 2.0;
        double result = 0.0;
        double mod = 0.0;

        result = num1 / num2;  //6.25
        mod = num1 % num2; //0.5

        System.out.printf(Locale.US, "%,.2f / %,.2f = %,016.2f\n", num1, num2, result);
        System.out.printf(Locale.US, "%.2f %% %.2f = %.2f", num1, num2, mod);
    }
}
