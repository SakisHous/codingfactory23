package gr.aueb.cf.ch6;

/**
 * This app searches for min value, min position,
 * max value, max position of an unsorted array.
 */
public class ArrayMinMaxApp {

    public static void main(String[] args) {
        int[] arr = {30, 12, 80, 7, 15, 99, 85, -12, 11, 45, 38, -9, -14, -72, 74, -72, -280};
        min(arr);
        max(arr);

    }

    public static void min(int[] arr) {
        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        System.out.printf("Min value: %d at position: %d\n", minValue, minPosition + 1);
    }

    public static void max(int[] arr) {
        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        System.out.printf("Max value: %d at position: %d\n", maxValue, maxPosition + 1);
    }
}
