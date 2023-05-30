package gr.aueb.cf.ch2;

public class TypecastApp {
    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 100L;
        long result = 0L;

        num1 = (int) num2;  //typecasts are error-prone
        result = num1 + num2;
        System.out.println(result);
    }
}
