package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class WriterApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/jtmp/test1.txt");
             PrintWriter pw = new PrintWriter("C:/jtmp/test1pw.txt")){
            ps.println("Hello CF! from PrintStream");
            pw.println("Hello CF! from PrintWriter");
            pw.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File path not found");
        }

    }
}