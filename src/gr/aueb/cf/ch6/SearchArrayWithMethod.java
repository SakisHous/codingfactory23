package gr.aueb.cf.ch6;

public class SearchArrayWithMethod {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 5, 9, 10, 4, 67, 88, 6};
        int value = 6;
        int position = 0;
        position = getElementPosition(arr, value);

        System.out.println(position);
    }

    public static int getElementPosition(int[] arr, int value) {
        if (arr == null) return -1;

        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                position = i;
                break;
            }
        }

        return position;
    }
}
