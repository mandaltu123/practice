package ds.search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * There are quite a few approaches here in finding duplicates in an array. We will try
 * and see some of those
 */

public class FindDuplicateInArray {

    /**
     * First is the brute force approach
     */

    public static void findDuplicateBruteForce(int[] a, int n) {
        System.out.println("********findDuplicateBruteForce**********");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(a[i] == a[j]) {
                    System.out.println("found duplicate " + a[i]);
                    return; // returning because we are just finding whether there is a duplicate or not
                }
            }
        }
        System.out.println("there are no duplicates");
        System.out.println("-----------------------------------------");
    }

    /**
     * Sort based approach.
     * First we will sort the array. Once sorted, the duplicates will come adjacent to each other
     */

    public static  void findDuplicateBySorting(int[] a, int n) {
        System.out.println("********findDuplicateBySorting**********");
        int[] b = a;
        Arrays.sort(b);
        for (int i = 0; i < n; i ++) {
            if(b[i] == b[i+1]) {
                System.out.println("found duplicate " +b[i]);
                return;
            }
        }
        System.out.println("there are no duplicates");
        System.out.println("-----------------------------------------");
    }


    /**
     * hash map based implementation
     * @param a
     * @param n
     */
    public static void findDuplicateByHashMap(int[] a, int n) {
        System.out.println("********findDuplicateByHashMap**********");
        Map<Integer, Integer> map = new HashMap<>();
        boolean isDuplicate = false;
        for (int i = 0; i < n; i++) {
            if(map.get(a[i]) != null) {
                isDuplicate =true;
                map.put(a[i], map.get(a[i]) +1);
            } else {
                map.put(a[i], 1);
            }
        }
        if(isDuplicate) {
            System.out.println("Here are the count of duplicates "  + map);
        }
        System.out.println("-----------------------------------------");
    }


    /**
     * Making array elements negative
     */

    public static void findDuplicates(int n, int... a) {
        System.out.println("********findDuplicates**********");
        for (int i = 0; i < n; i++) {
            if(a[Math.abs(a[i])] < 0) {
                System.out.println("Duplicate exists " + a[i]);
                return;
            } else {
                a[a[i]] = - a[a[i]];
            }
        }
        System.out.println("-----------------------------------------");
    }

}

class DuplicateTester {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 1, 2, 5, 6};
        int n = a.length;
        FindDuplicateInArray.findDuplicateBruteForce(a, n);
        FindDuplicateInArray.findDuplicateBySorting(a, n);
        FindDuplicateInArray.findDuplicateByHashMap(a, n);
        FindDuplicateInArray.findDuplicates(n, a);
    }
}
