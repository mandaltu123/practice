package ds.search;

import java.util.Arrays;

public class SearchInSortedArray {

    public static int searchInSortedArray(int[] a, int key) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            } else if (a[i] > key) {
                return -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[] {4, 6, 1, 3, 7, 9, 10};
        int key = 6;
        System.out.println(searchInSortedArray(array, key));
    }
}
