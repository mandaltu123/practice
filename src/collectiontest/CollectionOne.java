package collectiontest;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionOne {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        Vector<Integer> v = new Vector<>();
        Hashtable<Integer, String> h = new Hashtable<>();
        v.addElement(1);
        v.addElement(2);
        h.put(1, "stevie");
        h.put(2, "ray");
        h.put(3, "vaughan");

        // Array instance creation requires [], while Vector
        // and hastable require ()
        // Vector element insertion requires addElement(), but
        // hashtable element insertion requires put()

        // Accessing first element of array, vector and hashtable
        System.out.println(arr[0]);
        System.out.println(v.get(0));
        System.out.println(h.get(1));
    }
}
