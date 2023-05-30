package gr.aueb.cf.ch7;

/**
 * String declaration and initialization.
 */
public class StringDeclaration {

    public static void main(String[] args) {
        String alice = "Alice";
        String alice2 = "Alice";
        String bob = new String("Bob");

        System.out.println(alice);
        System.out.printf("%s\n", alice);
        System.out.println(alice + " " + bob);
        System.out.println(alice.hashCode());
    }
}
