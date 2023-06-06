package gr.aueb.cf.testbed10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

/**
 * This program reads a text file and finds
 * the different characters in the text and
 * counts them how often they appear.
 *
 * @author Thanasis Chousiadas
 */
public class Project3 {

    public static void main(String[] args) {
        int[][] charactersArr = new int[256][2];
        int pivot = 0;
        int index;

        try(BufferedReader bf = new BufferedReader(new FileReader("C:/jtmp/characters-counting.txt"))) {
            int ch;

            while ((ch = bf.read()) != -1) {
                index = findCharacter(charactersArr, ch);
                if (index != -1) {
                    charactersArr[index][1]++;
                } else {
                    charactersArr[pivot][0] = ch;
                    charactersArr[pivot][1] = 1;
                    pivot++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        int[][] reducedCharsArr = reducedArray(charactersArr, pivot);

//        sortByCharacter(reducedCharsArr);
//        printArray(reducedCharsArr, pivot);

        sortByFrequency(reducedCharsArr);
        printArray(reducedCharsArr, pivot);
    }


    public static int findCharacter(int[][] arr, int ch) {
        int index = -1;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i][0] == ch) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int[][] reducedArray(int[][] arr, int pivot) {
        return Arrays.copyOfRange(arr, 0, pivot + 1);
    }

    public static void printArray(int[][] arr, int pivot) {

        for (int i = 0; i < pivot; i++){
            System.out.printf("%d, %d%n", arr[i][0], arr[i][1]);
        }

    }

    public static void sortByCharacter(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
    }

    public static void sortByFrequency(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt((int[] a) -> a[1]).reversed() );
    }

}
