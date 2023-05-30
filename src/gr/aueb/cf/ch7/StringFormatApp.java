package gr.aueb.cf.ch7;

/**
 * Formats an app.
 */
public class StringFormatApp {

    public static void main(String[] args) {
        char row = 'B';
        int col = 4;

        String seat = String.format("%c%02d", row, col);

        System.out.println(seat);
    }
}
