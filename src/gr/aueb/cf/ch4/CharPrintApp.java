package gr.aueb.cf.ch4;

/**
 * Prints char values
 */
public class CharPrintApp {

    public static void main(String[] args) {
        char ch1 = '!';
        char ch2 = '8';
        char ch3 = 'L';
        char ch4 = 'O';

        System.out.printf("char: %c, ordinal: %d%n", ch1, (int) ch1);
        System.out.printf("char: %c, ordinal: %d%n", ch2, (int) ch2);
        System.out.printf("char: %c, ordinal: %d%n", ch3, (int) ch3);
        System.out.printf("char: %c, ordinal: %d%n", ch4, (int) ch4);
    }
}
