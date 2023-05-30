package gr.aueb.cf.ch2;

/**
 * A class that shows a random number
 * between 1 and 6.
 * @author Thanasis Chousiadas
 */
public class RandomDieApp {
    public static void main(String[] args) {
        int die = (int) (Math.random() * 6) + 1;

        System.out.println("Το ζάρι μας δίνει: " + die);
    }
}
