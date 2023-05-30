package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * This app converts seconds given by a user in
 * days, hours, minutes and seconds.
 * stdin an integer
 * stdout four integers
 * @author Thanasis Chousiadas
 */
public class SecondsDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int DAY_SECS = 24 * 3600;
        final int HOUR_SECS = 3600;
        final int MINUTE_SECS = 60;
        int remainingSeconds = 0;
        int inputSeconds = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        System.out.println("Please insert seconds:");
        inputSeconds = sc.nextInt();
        remainingSeconds = inputSeconds;

        days = remainingSeconds / DAY_SECS;
        // remainingSeconds %= DAY_SECS;
        remainingSeconds = remainingSeconds % DAY_SECS;
        hours = remainingSeconds / HOUR_SECS;
        remainingSeconds = remainingSeconds % HOUR_SECS;
        minutes = remainingSeconds / MINUTE_SECS;
        seconds = remainingSeconds % MINUTE_SECS;

        System.out.printf("%d seconds = %d days, %d hours, %d minutes, %d seconds",
                inputSeconds, days, hours, minutes, seconds);
    }
}
