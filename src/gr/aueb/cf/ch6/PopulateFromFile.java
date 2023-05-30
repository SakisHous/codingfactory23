package gr.aueb.cf.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Array populate from file.
 */
public class PopulateFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        int[] grades = new int[15];
        //File inFile = new File("C:\\Users\\sakis\\Downloads\\coding-factory\\Java\\grades.txt");
        Scanner sc = new Scanner(new File("C:\\Users\\sakis\\Downloads\\coding-factory\\Java\\grades.txt"));

        for (int i = 0; i < grades.length; i++) {
            grades[i] = sc.nextInt();
        }

        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        sc.close();
    }
}
