package gr.aueb.cf.ch6;

public class PrintArrayMethod {

    public static void main(String[] args) {
        int[] ages = {19, 24, 35, 56, 76, 45, 63};
        printArray(ages);
        System.out.println();
        printArray(ages, 1, 3);
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    /**
     * Overloading printArray().
     * @param arr           an array of integers.
     * @param low           the lowest pointer to begin.
     * @param high          the highest pointer to end.
     */
    public static void printArray(int[] arr, int low, int high) {
        //if (arr == null) return;
        if ((arr == null) || low < 0 || high > arr.length - 1) return;

        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
