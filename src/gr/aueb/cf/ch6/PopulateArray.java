package gr.aueb.cf.ch6;

/**
 * Declaration, initialization and populate of
 * an array.
 */
public class PopulateArray {

    public static void main(String[] args) {

        // Declaration and initialization with size.
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 7;
        arr[2] = 8;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Unsized declaration and initialization
        int[] arr2 = {1, 4, 6, 0, 9};

        for (int item : arr2) {
            System.out.print(item + " ");
        }

        // Array initializer
        int[] arr3;
        arr3 = new int[] {1, 23, 45};
    }
}
