package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Makes an array copy by using utility
 * methods.
 */
public class ArrayCopyApp {

    public static void main(String[] args) {
        int[] arr = {1, 20, 30, 40, 67, 55, 37, 93, 60, 76};
        int[] arr2 = new int[arr.length];
        int[] arr3;
        int[] arr4;

        System.arraycopy(arr, 0, arr2, 0, arr.length);

        for (int item : arr2) {
            System.out.print(item + " ");
        }
        System.out.println();
        // Arrays class
        arr3 = Arrays.copyOf(arr, arr.length);

        for (int item : arr3) {
            System.out.print(item + " ");
        }
        System.out.println();
        arr4 = Arrays.copyOfRange(arr, 2, arr.length);

        for (int item : arr4) {
            System.out.print(item + " ");
        }
    }
}
