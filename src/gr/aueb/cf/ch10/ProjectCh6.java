package gr.aueb.cf.ch10;

/**
 * Finds the position in an array of the max element
 * of an array.
 */
public class ProjectCh6 {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 12, 3, 4, -4, 100, 1000, 56, 45, 9, -3, -1, -7, 1, 12, 3, 4, -4, 100, 1001, 56, 45, 9, -3, -1, -7};
        int maxPos;

        maxPos = getMaxPosition(arr, 0, arr.length - 1);

        if (maxPos == -1) {
            System.out.println("Error");
            System.exit(1);
        }

        System.out.printf("Position: %d, Value: %d", maxPos, arr[maxPos]);
    }

    /**
     * Returns the position of the max element.
     *
     * @param arr       the source array.
     * @param low       the low index (lowest is 0)
     * @param high      the high index (highest is arr.length - 1)
     * @return          the position of max element.
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = 0;
        int maxValue = 0;

        if (arr == null || arr.length == 0) return -1;

        if ( low < 0 || high > arr.length - 1 || low > high) return -1;

        maxValue = arr[low];

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }

        return maxPosition;
    }
}
