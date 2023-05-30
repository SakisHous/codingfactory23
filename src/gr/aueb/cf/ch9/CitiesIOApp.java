package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Reads from a file with data format
 * country1 city1 city2 city3...
 * country2 city1, city2, city3...
 *
 * and write each line in different output file.
 *
 * We are using Java.io package.
 */
public class CitiesIOApp {

    public static void main(String[] args) {
        String line;
        String[] cities;
        File dir = new File("C:/jtmp/io");

        if (!dir.exists()) {
            if (!dir.mkdir()) {
                System.out.println("Error in make dir");
                System.exit(1);
            }
        }

        try (BufferedReader bf = new BufferedReader(new FileReader("C:/jtmp/cities.txt"))){
            while ((line = bf.readLine()) != null) {
                cities = line.split(" +");

                switch (cities[0]) {
                    case "Greece":
                        File grFile = new File(dir + "/" + cities[0].substring(0, 2).toLowerCase() + ".txt");
                        PrintStream gr = new PrintStream(grFile, StandardCharsets.UTF_8);
                        print(gr, "GR cities");
                        print(gr, cities);
                        break;
                    case "USA":
                        File usFile = new File(dir + "/" + cities[0].substring(0, 2).toLowerCase() + ".txt");
                        PrintStream us = new PrintStream(usFile, StandardCharsets.UTF_8);
                        print(us, "USA cities");
                        print(us, cities);
                        break;
                    case "Germany":
                        File deFile = new File(dir + "/" + cities[0].substring(0, 2).toLowerCase() + ".txt");
                        PrintStream de = new PrintStream(deFile, StandardCharsets.UTF_8);
                        print(de, "Germany cities");
                        print(de, cities);
                        break;
                    default:
                        System.err.println("Error in cities");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void print(PrintStream ps, String message) {
        ps.println(message);
    }

    public static void print(PrintStream ps, String[] tokens) {
        for (int i = 1; i < tokens.length; i++) {
            ps.print(tokens[i] + " ");
            //print(ps, token[i] + " ");
        }
    }
}
