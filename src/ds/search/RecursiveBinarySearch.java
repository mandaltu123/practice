package ds.search;

import java.util.Arrays;

public class RecursiveBinarySearch {

    public static int recursiveBinarySearch(int[] a, int low, int high, int key) {
        // find the middle of the array

       if (high >= low) {
           int mid = low + (high -low) / 2;
           if (a[mid] == key) {
               return mid;
           } else if (a[mid] < key) { // this means we need to look at the right side of the array as the element to be
               // searched is grater than the mid of the array
               return recursiveBinarySearch(a, mid + 1, high, key);
           } else {
               // we are gonna be looking at the left half of the array
               return recursiveBinarySearch(a, low, mid -1, key);
           }
       }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[] {4, 6, 1, 9, 3, 5, 10};
        Arrays.sort(array);
        int key = 5;
        int high = array.length -1 ;
        int low = 0;
        System.out.println(recursiveBinarySearch(array, low, high, key));
    }
}
