package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BreakContinueApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("Please give a number: ");
            num = sc.nextInt();
            if (num == 5){
                continue; // ξαναπάει στην αρχη, δεν εκτελούνται τα παρακάτω
            }
            sum += num;
            if (num == 10) {
                System.out.println("Bingo!");
                break;
            }
        }

        System.out.println("Sum: " + sum);
    }
}
