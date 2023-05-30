package gr.aueb.cf.ch7;

public class SubstringDemo {

    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(i, i + 1));
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.substring(i, i + 1));
        }
    }
}
