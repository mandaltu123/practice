package arrays;

import java.util.Arrays;

public class CyclicRotation {

    public static void rotate(int[] arr) {
        if(arr == null || arr.length == 0) {
            return;
        }

        int x = arr[arr.length -1];
        int i;
        for (i = arr.length -1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = x;
    }

    public static void main(String[] args) {
        int arr[] = new int[] {1, 2, 3, 4, 5};

        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
