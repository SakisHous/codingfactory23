package gr.aueb.cf.ch2;

/**
 * This app gives the result of
 * two dice.
 * stdout two integers
 *
 * @author Thanasis Chousiadas
 */
public class RandomDiceApp {

    public static void main(String[] args) {
        int die1 = 0;
        int die2 = 0;

        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;

        System.out.printf("Die 1: %d, Die 2: %d", die1, die2);
    }
}
