package ds.search;

import java.util.Arrays;

public class IterativeBinarySearch {


    /**
     *
     * @param a     : underlying array
     * @param n     : length of the array
     * @param key   : element to be searched
     * @return
     */
    public static int binarySearch(int[] a, int n, int key) {
        int low = 0;
        int high = n -1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2; // to avoid overflow
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[] {4, 6, 1, 3, 7, 9, 10};
        Arrays.sort(array);
        int key = 6;
        System.out.println(binarySearch(array, array.length, 6));
    }
}
