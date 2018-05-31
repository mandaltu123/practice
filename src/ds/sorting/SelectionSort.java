package ds.sorting;

import java.util.Arrays;


/**
 * Sorting algorithms are the pillars of data structure
 *
 * Please refer cs50 courses for understanding
 *
 * https://www.youtube.com/watch?v=f8hXR_Hvybo&list=PLNUGZd06N4RdQi2ZX5tGvNYhdzzeJmNCF&index=3
 */
public class SelectionSort {


    public static void selectionSort(int input[])
    {
        // corner case
        if(input == null || input.length == 0)
        {
            System.out.println("Invalid input");
            return;
        }

        // current minimum
        int current_min;
        for (int i = 0; i< input.length; i++)
        {
            current_min = i; // assuming the first element is the minimum
            // start iterating over the next set of elements and find the minimum
            for (int j = i + 1; j < input.length; j++)
            {
                if (input[current_min] > input[j])
                {
                    current_min = j;
                }
            }
            // now we have found the minimum elements within the next set of elements
            // so swap that with the initial minimum
            swap(i, current_min, input);
        }
    }

    private static void swap(int i, int current_min, int[] input) {
        int tmp = input[current_min];
        input[current_min] = input[i];
        input[i] = tmp;
    }

    public static void main(String[] args) {
        int[] input = new int[]{23, 4, 8, 16, 42, 15};
        selectionSort(input);
        System.out.println("sorted array : " + Arrays.toString(input));
    }
}
