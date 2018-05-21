package ds.arrays;

public class ReverseAnArrayWithoutForLoop
{

    public void reverse(int array[], int length)
    {
        if (array == null || array.length == 0)
        {
            return;
        }
        if (length == 0 || length == -1 || length > array.length)
        {
            return;
        }
        System.out.print(array[length -1] + " ");
        reverse(array, length -1);
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 5, 6, 7};
        new ReverseAnArrayWithoutForLoop().reverse(array, array.length);
    }

}
