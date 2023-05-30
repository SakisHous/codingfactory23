package gr.aueb.cf.ch6;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {6, 8, 2, 14, 3, 25, 12, 65, 53, 2, 44, 3, -3, -7, 8, 9, -10};

        int minVal;
        int minPosition;
        int tmp;

        for (int i = 0; i < arr.length - 1; i++) {

            minPosition = i;
            minVal = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minVal) {
                    minVal = arr[j];
                    minPosition = j;
                }
            }

            tmp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = tmp;
        }
        print(arr);
        descending(arr);
        print(arr);
    }

    public static void descending(int[] arr) {
        int tmp;

        for (int i = 0; i < arr.length / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
    }

    public static void print(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
