package gr.aueb.cf.testbed9;

import java.io.*;

/**
 * This app reads a txt file which contains
 * records with the format
 * "firstname lastname grade_1 grade_2",
 * computes the average of the two grades and
 * write them with the name in a new text file (primOut.txt).
 * If there is problem with grades ( < 0 || > 10) write the
 * record in a log file (log.txt).
 *
 * @author Thanasis Chousiadas
 */
public class GradesIOApp {

    public static void main(String[] args) {
        String line = "";
        String[] tokens;
        int grade1, grade2;
        double average = 0.0;

        try (BufferedReader bf = new BufferedReader(new FileReader("C:/jtmp/grades.txt"));
             PrintStream ps = new PrintStream(new FileOutputStream("C:/jtmp/primOut.txt", true));
             PrintStream log = new PrintStream(new FileOutputStream("C:/jtmp/log.txt", true))) {

            while ((line = bf.readLine()) != null) {

                if (isValidRecord(line)) {
                    tokens = line.split(" +");
                    grade1 = Integer.parseInt(tokens[2]);
                    grade2 = Integer.parseInt(tokens[3]);
                    average = (double) (grade1 + grade2) / 2;
                    ps.println(tokens[0] + " " + tokens[1] + " " + average);
                } else {
                    log.println(line);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static boolean isValidRecord(String s) {
        int grade1, grade2;
        String[] tokens;

        tokens = s.split(" +");

        if (tokens.length != 4) return false;

        try {

            grade1 = Integer.parseInt(tokens[2]);
            grade2 = Integer.parseInt(tokens[3]);

            if (grade1 < 0 || grade1 > 10) throw new IOException();
            if (grade2 < 0 || grade2 > 10) throw new IOException();

            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
