package gr.aueb.cf.ch8;

public class CommonErrorCases {

    public static void main(String[] args) {
        int[] arr = {23, 45, 2, 0, -100, 98, 45, -3};
        int minPosition;

        minPosition = getMinPosition(arr);

        if (minPosition == -1) {
            System.out.println("Invalid Array");
        } else {
            System.out.println("Min pos: " + minPosition);
        }

    }

    public static int getMinPosition(int[] arr) {
        if(arr == null) return -1;

        int minPos = -1;
        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minPos = i;
                minVal = arr[minPos];
            }
        }

        return minPos;
    }

    public static String getStringOrNull(String[] strArr, String str) {
        if (strArr == null | str == null ) return null;
        String strToReturn = null;

        for (String s : strArr) {
            if (s.contains(str)) {
                strToReturn = s;
            }
        }

        return strToReturn;
    }
}
