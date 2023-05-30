package gr.aueb.cf.testbed6;

/**
 * This class finds the max value in a slice of an
 * int-array.
 *
 * @author Thanasis Chousiadas
 */
public class ArrayMaxGenericApp {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 8, 12, 4, 35, 100, 9, -3, -8, 0, 1, 94, 12};
        int maxPosition = -1;

        maxPosition = getMaxPosition(arr, 0, 6);

        System.out.printf("Max pos: %d, max val: %d", maxPosition, arr[maxPosition]);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = low;
        int maxValue;

        if (arr == null) return -1;
        if ((low < 0) || (high > arr.length)) return -1;
        if (high < low) return -1;

        maxValue = arr[low];

        for (int i = low + 1; i < high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        return maxPosition;
    }
}
