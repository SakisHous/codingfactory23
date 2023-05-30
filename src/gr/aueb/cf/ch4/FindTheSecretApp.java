package gr.aueb.cf.ch4;


import java.util.Scanner;

/**
 * This app ois a game where the user
 * has 10 guesses to find the secret key. If user
 * find the key before last guess the for should
 * be terminated
 */
public class FindTheSecretApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SECRET_KEY = 8;
        boolean found = false;
        int num;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Please make a guess");
            num = sc.nextInt();

            if (num == SECRET_KEY) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No worries, play again");
            System.exit(1);
        }

        System.out.println("Success!!! You won the game!");
    }
}
