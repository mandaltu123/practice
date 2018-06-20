package ds.search;

public class UnorderedLinearSearch {


    public static int unorderedLineardSearch(int[] a, int key) {
        if (a == null || a.length == 0) {
            System.out.println("Not a valid input");
            return -1;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1; // assuming the input array is positive integer array
    }

    public static void main(String[] args) {
        int[] array = new int[] {3, 5, 7, 2, 5, 1, 9};
        int key = 5;
        System.out.println(unorderedLineardSearch(array, key));
    }
}
