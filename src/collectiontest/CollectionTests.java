package collectiontest;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTests {

    public static void main(String[] args) {
        Product door = new Product("Wooden door", 35);
        Product floorPanel = new Product("Floor panel", 25);
        Product window = new Product("Glass window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
        products.forEach(product -> System.out.println(product));
        //old way..use an iterator
        final Iterator<Product> productIterator = products.iterator();
        System.out.println("-----printing from iterator------");

        // if weight greater than 20 print else remove
        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            if(product.getWeight() > 20) {
                System.out.println(product.toString());
            } else {
                productIterator.remove();
            }
        }
        System.out.println("After removing--------->");
        products.forEach(product -> System.out.println(product));

    }
}
