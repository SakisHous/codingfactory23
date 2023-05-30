package gr.aueb.cf.ch6;

/**
 * Replaces all array digits with
 * the next digit.
 */
public class ReplaceNextDigitApp {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 8};
        int[] arr1 = {5, 2, 9, 8};
        shiftLeftByOne(arr, 0);   // output: [2, 8, 9, 0]

        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
        shiftLeftByOne(arr1, 2);   // output: [5, 9, 8, 0] το μηδενικό στοιχείο δεν συμμετέχει
        for (int item : arr1) {
            System.out.print(item + " ");
        }
    }

    public static void shiftLeftByOne(int[] arr, int low) {
        if (arr == null || low < 0 || low > arr.length) return;

        for (int i = low; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }
}
