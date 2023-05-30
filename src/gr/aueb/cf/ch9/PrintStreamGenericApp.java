package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamGenericApp {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:\\jtmp\\c23.txt");

        printMessage(ps, "Hello World! Coding Factory");        // Prints to ps
        printMessage(System.out, "Hello coding factory");       // Prints to stdout
    }

    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
