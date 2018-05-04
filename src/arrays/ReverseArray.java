package arrays;

import java.util.Arrays;
import java.util.Stack;

/**
 * Write a function to reverse an array
 */
public class ReverseArray {


    public static void reverse(int[] arr) {
        if(arr == null || arr.length == 0) {
            System.out.println("nothing to reverse");
            return;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
        }

        while (!stack.isEmpty()) {
            int item = stack.pop();
            System.out.print(item + " ");
        }
        System.out.println(" ");
    }



    public static void reverseWithoutStack(int[] arr, int start, int endIndex) {

        int tmp;
        if(start >= endIndex) {
            return;
        }

        tmp = arr[start];
        arr[start] = arr[endIndex];
        arr[endIndex] = tmp;
        reverseWithoutStack(arr, start+1, endIndex -1);
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        reverse(array);

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 0;
        int end = arr.length-1;
        reverseWithoutStack(arr, start, end);
        System.out.println("after reversal " + Arrays.toString(arr));
    }

}
