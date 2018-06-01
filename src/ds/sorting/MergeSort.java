package ds.sorting;

import java.util.Arrays;


/**
 * Time complexity: O(nLog(n))
 *
 * Auxiliary Space: O(n)
 *
 * Algorithmic Paradigm: Divide and Conquer
 *
 * Sorting In Place: No in a typical implementation
 *
 * Stable: Yes
 */
public class MergeSort {


    /**
     * main function that sorts arr[l...r] using merge
     *
     * @param arr
     * @param l
     * @param r
     */
    public void sort(int arr[], int l, int r) {

        if (l < r) {
            // find the middle
            int m = (l + r) / 2;
            // sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    /**
     * Merges two sub arrays
     * one array[l....m]
     * other one array[m+1...r]
     *
     * @param arr
     * @param l
     * @param m
     * @param r
     */
    private void merge(int[] arr, int l, int m, int r) {

        // find the length of the two sub arrays
        int n1 = m - l + 1;
        int n2 = r - m;

        // define two sub arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy over the data of these two sub arrays into two different temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        // Now we need to start merging these two arrays into the main array

        // initial indexes of the first and second sub array
        int i = 0, j = 0;

        // initial index of the merged sub array
        int k = l;// because it starts from l because that is the left most element in the array

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // after this we will have to check whether we have any element pending to be merged in left or right sub array
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    // Merge sort tester

    public static void main(String[] args) {
        int array[] = new int[]{3, 5, 7, 1, 9, 10};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length - 1);
        System.out.println("\n The sorted array ");
        System.out.println(Arrays.toString(array));
    }
}
