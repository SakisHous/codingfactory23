package gr.aueb.cf.ch7;

/**
 * Transform strings.
 */
public class LowerUpperTrimApp {

    public static void main(String[] args) {
        String s = "  Athens University of business and economics   ";
        String lowercase;
        String uppercase;
        String trimmed;
        String s2 = "";     // length() -> 0 δεν είναι null

        lowercase = s.toLowerCase();
        uppercase = s.toUpperCase();
        trimmed = s.trim();

        System.out.println(lowercase);
        System.out.println(uppercase);
        System.out.println(trimmed);

        System.out.println("*".repeat(15));

        if (s2.isEmpty()) {
            System.out.println(s2.length());
        }
    }
}
