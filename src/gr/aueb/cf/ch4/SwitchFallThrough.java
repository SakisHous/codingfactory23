package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * This app takes a grade from the user
 * and give a feedback (Excellent, Very Good, Good) if
 * grade is >=9, >=7 and >=5
 */
public class SwitchFallThrough {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please provide a grade");
        grade = sc.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Fail");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very good");
                break;
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Error in grade");
                break;
        }
    }
}
