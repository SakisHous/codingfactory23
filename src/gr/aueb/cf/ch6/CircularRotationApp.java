package gr.aueb.cf.ch6;

public class CircularRotationApp {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 8};
        int[] rightRotated = doCircularRightShiftBy(arr, 11);
        int[] leftRotated = doCircularLeftShiftBy(arr, 11);

        printArray(rightRotated);
        printArray(leftRotated);
    }

    public static int[] doCircularRightShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }

        return rotated;
    }

    public static int[] doCircularLeftShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }

        return rotated;
    }

    public static void printArray(int[] arr) {
        if (arr == null) return;
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
