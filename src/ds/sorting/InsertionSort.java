package ds.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int array[]) {
        // The corner case
        if (array == null || array.length == 0) {
            System.out.println("Invalid array");
            return;
        }

        int element;
        int j;
        for (int i = 1; i < array.length - 1; i++) { // starting from 1 as we are considering the first
            // element is already sorted or in the sorted portion
            element = array[i];
            j = i;
            while (j > 0 && array[j - 1] > element) {
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = element;
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{23, 4, 8, 16, 42, 15};
        insertionSort(input);
        System.out.println("sorted array : " + Arrays.toString(input));
    }
}
