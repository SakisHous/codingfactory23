package gr.aueb.cf.ch6;

public class MissingArrayElement {

    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 2, 4};
        int missingElement;

        missingElement = getMissing(arr);

        System.out.println(missingElement);
    }

    public static int getMissing(int[] arr) {
        int[] helperArr = new int[arr.length + 1];

        for (int i = 1; i <= arr.length + 1; i++) {
            System.out.println(i);
            for (int k : arr) {
                if (i != k) {
                    break;
                }
            }
        }
        return -1;
    }
}
