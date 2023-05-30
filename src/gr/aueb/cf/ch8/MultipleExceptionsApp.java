package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\sakis\\Downloads");
        char ch;

        try (Scanner in = new Scanner(file)) {
            ch = (char) System.in.read();
        } catch (FileNotFoundException | RuntimeException e1) {
            //e1.printStackTrace();
            System.out.println("File not found Error");
        } catch (IOException e2) {
            //e2.printStackTrace();
            System.out.println("Read Error");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}
