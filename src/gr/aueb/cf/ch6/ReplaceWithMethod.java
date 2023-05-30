package gr.aueb.cf.ch6;

public class ReplaceWithMethod {

    public static void main(String[] args) {
        int[] grades = {2, 3, 5, 4, 4, 7, 8, 3, 4, 4, 1, 0 , 0};
        upscaleByOne(grades);
        printArray(grades);

    }

    public static void upscaleByOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
