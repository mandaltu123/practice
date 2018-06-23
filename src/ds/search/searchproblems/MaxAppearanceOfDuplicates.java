package ds.search.searchproblems;

public class MaxAppearanceOfDuplicates {

    public static int findDuplicatesByBruteForce(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("invalid input");
            return -1;
        }

        int max = 0;
        int i;
        for (i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            if (counter > max) {
                max = counter;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 34, 3, 5, 5, 7, 1};
        System.out.println(findDuplicatesByBruteForce(array));
    }
}
