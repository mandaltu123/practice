package collectiontest.lists;

import java.util.*;

public class ListOperations {

    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreIntegers = {6, 7, 8, 9};
        collection.addAll(Arrays.asList(moreIntegers));
        collection.forEach(num -> System.out.println(num));
        Collections.addAll(collection, moreIntegers);
        collection.forEach(num -> System.out.print(num + " "));
        Collections.addAll(collection, 10, 11, 12);
        System.out.println(" ");
        collection.forEach(num -> System.out.print(num + " "));
        System.out.println(" ");
        List<Integer> ints = Arrays.asList(15, 16, 17);
        ints.set(1, 99);
        System.out.println(ints);
        // ints.add(21);Exception in thread "main" java.lang.UnsupportedOperationException
        collection.addAll(ints);
        System.out.println("------");
        collection.forEach(num -> System.out.print(num + " "));
        collection.add(500);
        System.out.println("------");
        collection.forEach(num -> System.out.print(num + " "));
    }
}
