package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class IOEncodingApp {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        PrintStream ps = new PrintStream("C:/jtmp/encoding1.txt", "UTF-8");
        PrintWriter pw = new PrintWriter("C:/jtmp/encoding2.txt", "Windows-1252");

        ps.print("Οικονομικό Πανεπιστήμιο Αθηνών");
        pw.print("Οικονομικό Πανεπιστήμιο Αθηνών");

        ps.close();
        pw.close();
    }
}
