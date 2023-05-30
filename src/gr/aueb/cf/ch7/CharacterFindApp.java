package gr.aueb.cf.ch7;

/**
 * This program finds a character or
 * substring of a String.
 */
public class CharacterFindApp {

    public static void main(String[] args) {
        String s = "Athens University of Business and Economics";
        int index = -1;

        if (s.contains("Economics")) System.out.println("Bingo!");

        index = s.indexOf("Uni");
        System.out.println("Start index of Uni: " + index);     //output: 7

        index = s.indexOf('t');
        System.out.println("Start index of 't': " + index);     //output: 1

        index = s.indexOf('a');
        System.out.println("Start index of 'a': " + index);     //output: 30

        index = s.lastIndexOf('t');
        System.out.println("Start index of 't': " + index);     //output: 15

        index = s.indexOf('s', 7);
        System.out.println("Start index of 's': " + index);     //output: 13

        if (s.startsWith("Athens")) System.out.println("Bongo");
        if (s.startsWith("Uni", 7)) System.out.println("Bingo");
    }
}
