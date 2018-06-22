package ds.search.searchproblems;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInAnArraySet {


    /**
     * find duplicate true or false using an auxiliary set
     *
     * @param array
     * @return
     */
    public static boolean hasDuplicate(int[] array) {
        // corner case
        if (array == null || array.length == 0) {
            System.out.println("Invalid input");
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                return true;
            } else {
                set.add(array[i]);
            }
        }
        return false;
    }


    /**
     * Brute force approach, which leads to time complexity O(n^2) at worst case
     * @param array
     * @return
     */
    public static boolean hasDuplicateBruteForce(int[] array) {
        // first corene case

        if (array == null || array.length == 0) {
            System.out.println("Not a valid input");
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            // we have to iterate the whole array again and check whether the ith element appears in the array once
            // or not
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean hasDuplicatesWithArrayNegation(int[] array) {
        // corner case
        if (array == null || array.length == 0) {
            System.out.println("Invalid input");
            return false;
        }

        for (int i =0; i < array.length; i++) {
            if (array[Math.abs(array[i])] > 0) {
                array[Math.abs(array[i])] = - array[Math.abs(array[i])];
            } else {
                // if it lands in this loop, it means there is a duplicate element
                System.out.println("Duplicate Exists");
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] array = new int[]{4, 6, 1, 4, 6, 7, 3, 5};
        System.out.println("has duplicates ? " + hasDuplicate(array));
        System.out.println("has duplicates ? " + hasDuplicateBruteForce(array));
        System.out.println("Has duplicate ? " + hasDuplicatesWithArrayNegation(array));
    }
}
