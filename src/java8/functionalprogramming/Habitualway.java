package java8.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class Habitualway {

    static boolean found = false;

    static List<String> cities = Arrays.asList("Bangalore", "Delhi", "Pune", "Kolkata");

    public static void main(String[] args) {
        for (String city : cities) {
            if (city.equals("Bangalore")) {
                found = true;
                break;
            }
        }

        System.out.println("Found city Bangalore ? " + found);
        /**
         * This imperative way is little dirty, there are too many moving parts to it.
         * first we declare a boolean variable found. then we iterate over the list and
         * check whether that city exists in the list or not.
         *
         */

        // A better way of doing it is :
        System.out.println("Found city Bangalore ? " + cities.contains("Bangalore"));

        /**
         * Tangible Improvements
         * That change improved our code in quite a few ways:
         * • No messing around with mutable variables
         * • Iteration steps wrapped under the hood
         * • Less clutter
         * • Better clarity; retains our focus
         * • Less impedance; code closely trails the business intent
         * • Less error prone
         * • Easier to understand and maintain
         */
    }
}
