package ds.sorting;


import java.util.Arrays;

/**
 * Another preliminary sorting technique is bubble sort
 * In bubble sort we compare one element with its next element in the array.
 * If left is greater than the right, we swap.
 */
public class BubbleSort {


    public static void bubbleSort(int input[])
    {
        // corner case
        if (input == null || input.length == 0)
        {
            System.out.println("not a valid array");
            return;
        }

        int n = input.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (input[j] > input[j+1])
                {
                    swap(j, j+1, input);
                }
            }
        }
    }

    private static void swap(int i, int j, int[] input) {
        int temp = input[j];
        input[j] = input[i];
        input[i] = temp;
    }

    public static void main(String[] args) {
        int[] input = new int[]{23, 4, 8, 16, 42, 15};
        bubbleSort(input);
        System.out.println("sorted array : " + Arrays.toString(input));
    }

}
