package arrays;

/**
 * An array is collection of items stored at continuous memory locations. The idea is to store multiple items of same
 * type together. This makes it easier to calculate the position of each element by simply adding an offset to a base
 * value, i.e., the memory location of the first element of the array (generally denoted by the name of the array).

 For simplicity, we can think of an array a fleet of stairs where on each step is placed a value (let’s say one of your
 friends). Here, you can identify the location of any of your friends by simply knowing the count of the step they are
 on.
 */
public class ArrayBasics {


    public static void main(String[] args) {
        // declaring a char array
        char array[] = {'a', 'b', 'c', 'd'};


        // declaring an int array
        int arr[] = {1, 2, 3, 4, 5};

        // String array

        String a[] = {"this", "is", "my", "december"};


        System.out.println("Printing 3rd element ie 2nd index " + a[2]);
    }
}
