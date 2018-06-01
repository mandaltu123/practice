package ds.arrays;

import java.util.Arrays;

public class RemoveElementFromAnArray {


    /**
     *
     * @param array input array
     * @param n length of the array
     * @param x element to be deleted from the array
     * @return returns new size of the array if the element to be deleted is found in the array
     */
    public static int remove(int[] array, int n, int x) {
        int i;
        for(i = 0; i < n; i++) {
            if (array[i] == x) {
                break;
            }
        }
        //if x found in the array
        if(i < n) {
            n = n -1;
            for(int j = i; j< n; j++) {
                array[j] = array[j+1];
            }
        }
        return n;
    }


    public static void main(String[] args) {

        int arr[] = {11, 15, 6, 8, 9, 10};
        System.out.println("input array is      = " + Arrays.toString(arr));
        int n = arr.length;
        int x = 6;

        // Delete x from arr[]
        remove(arr, n, x);
        System.out.println("Modified array is   = " + Arrays.toString(arr));
    }
}
