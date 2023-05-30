package gr.aueb.cf.testbed6;

/**
 * This app finds the second-smallest int of
 * an int-array with two methods. The most efficient
 * is with findSecMin() method, because it uses one for statement.
 *
 * @author Thanasis Chousiadas
 */
public class SecondMinIntApp {

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 8, 12, 4, 35, -100, 9, 3, -8, 0, 1, 94, 12};
        int secMinPos = -1;

        secMinPos = getSecondMinPosition(arr);

        System.out.printf("Second Min. Pos.: %d, Second Min. Val.: %d\n", (secMinPos + 1), arr[secMinPos]);

        findSecMin(arr);
    }

    /**
     * This method computes the second min value
     * storing 4 variable for position and value of the two
     * smallest integers. It does not take account if the array has two
     * identical values as min values. In this situation the second min value
     * is not the same with min value.
     * @param arr       the given array.
     */
    public static void findSecMin(int[] arr) {
        int minPos = -1;
        int minVal = Integer.MAX_VALUE;
        int secMinPos = -1;
        int secMinVal = Integer.MAX_VALUE;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                secMinPos = minPos;
                minPos = i;
                secMinVal = minVal;
                minVal = arr[i];
            } else if (arr[i] < secMinVal){
                secMinPos = i;
                secMinVal = arr[i];
            }
        }
        System.out.printf("Second min %d, second val: %d", (secMinPos + 1), arr[secMinPos]);
    }

    /**
     * This method calls the minPos() method which
     * finds the min position of an int-array excluding an
     * element.
     *
     * @param arr       the given array.
     * @return          the second min position.
     */
    public static int getSecondMinPosition(int[] arr) {
        int minPos;
        if (arr == null) return -1;

        minPos = minPos(arr, -1);

        return minPos(arr, minPos);
    }

    /**
     * This method finds the min position of and an int-array
     * excluding an element.
     * @param arr           the given array.
     * @param exclPos       the position that we do not want to check if it has the min value.
     * @return              the min position of the other elements.
     */
    public static int minPos(int[] arr, int exclPos) {
        int minPosition = -1;
        int minValue = Integer.MAX_VALUE;

        if (arr == null) return -1;

        for (int i = 1; i < arr.length; i++) {
            if ( i != exclPos) {
                if (arr[i] < minValue) {
                    minPosition = i;
                    minValue = arr[i];
                }
            }
        }

        return minPosition;
    }

}
