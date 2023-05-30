package gr.aueb.cf.ch6;

/**
 * This app gets an array of grades (0 to 100)
 * and distributes the grades in a chart
 */
public class GradesDistributionApp {

    public static void main(String[] args) {
        int[] grades = {10, 80, 70, 55, 42, 86, 91, 34, 65, 88, 29, 48, 55, 77, 8, 77, 45, 90, 88, 62, 64, 22, 7, 72, 66, 69, 81, 99, 100, 55, 59, 34};
        int[] count = new int[10];

        for (int grade : grades) {
            if (grade == 100) {
                count[9] += 1;
            } else {
                count[grade / 10] += 1;
            }

        }

        for (int i = 0; i < count.length; i++) {
            System.out.printf("%02d - %3d: ", i * 10, (i != 9) ? (i * 10 + 9) : (i * 10 + 10));
            for (int j = 1; j <= count[i]; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
