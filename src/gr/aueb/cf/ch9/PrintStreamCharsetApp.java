package gr.aueb.cf.ch9;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Defines PrintStream with charset.
 */
public class PrintStreamCharsetApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/jtmp/ps-charset.txt", StandardCharsets.UTF_8)) {
            ps.println("PrintStream using charset");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
