package gr.aueb.cf.ch7;

/**
 * Compares two strings for equality.
 */
public class EqualsApp {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = new String("Athens");

        if (s1.equals(s3)) {
            System.out.println("s1 and s3 are equals.");
        }
    }
}
