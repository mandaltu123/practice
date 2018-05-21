package ds.arrays;

import java.util.Arrays;

public class ReverseWithForLoop
{

    public static int[] reverseWithLoop(int[] array)
    {
        int[] reversed  = new int[array.length];
        if (array == null || array.length == 0)
        {
            return reversed;
        }
        int length = array.length;

        for (int i = 0; i < length; i++)
        {
            reversed[i] = array[length -1 -i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 5, 6, 7};
        int[] result = reverseWithLoop(array);
        System.out.println(Arrays.toString(result));
    }
}
