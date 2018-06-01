package ds.sorting;

import java.util.Arrays;

public class QuickSort {


    /**
     * The main function that implements quicksort()
     *
     * @param arr  -> array to be sorted
     * @param low  -> starting index
     * @param high -> end index
     */
    public void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // pi is the partition index, arr[pi] is now at the right place
            int pi = partition(arr, low, high);
            // recursively sort elements before partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    /**
     * Partition method is where the actual magic happens
     * This function takes the last element as pivot, sorts
     * puts the smaller elements to its left and higher elements
     * to its right,
     *
     * @param arr
     * @param low
     * @param high
     * @return
     */
    private int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;// index of the smaller element
        // if current element is smaller or equal to the pivot
        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // swa arr[i] and arr[j]
                swap(arr, i, j);
            }
        }
        // swap arr[i + 1] and the pivot
        swap(arr, i + 1, high);
        return i + 1;
    }

    /**
     * swaps elements using a temporary variable
     *
     * @param arr
     * @param i
     * @param j
     */
    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int array[] = new int[]{3, 5, 7, 1, 9, 10};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array, 0, array.length - 1);
        System.out.println("\nThe sorted array ");
        System.out.println(Arrays.toString(array));
    }
}
