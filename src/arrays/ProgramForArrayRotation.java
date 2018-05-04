package arrays;


import java.util.Arrays;

/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 *
 * array = {1, 2, 3, 4, 5, 6, 7}
 *
 * if we rotate the array at 2, the result would be
 * {3, 4, 5, 6, 7, 1, 2}
 */
public class ProgramForArrayRotation {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotateUsingTempArray(arr, 2,7);
        System.out.println(Arrays.toString(arr));
    }


    /**
     *
     * @param arr
     * @param d
     * @param n
     */
    public static void rotateUsingTempArray(int[] arr, int d, int n) {

        int i;
        for (i = 0; i < d; i++) {
            leftRotateByOne(arr, n);
        }
    }


    private static void leftRotateByOne(int[] arr, int n) {
        int i, tmp;
        tmp = arr[0];

        for (i = 0; i < n -1; i++) {
            arr[i] = arr[i+1];
        }
        arr[i] = tmp;
    }
}
