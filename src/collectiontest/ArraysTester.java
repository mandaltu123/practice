package collectiontest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class ArraysTester {
    public static void main(String[] args) {
        Product door = new Product("Wooden door", 35);
        Product floorPanel = new Product("Floor panel", 25);

        // Create arrays
        Product[] products = {door, floorPanel};
        System.out.println(Arrays.toString(products));
        // print a particular element
        System.out.println(products[1]);
        //add another element to the array
        Product window = new Product("Wooden bed", 50);
        products = add(window, products);
        System.out.println(Arrays.toString(products));

        // we can add duplicates in an array
        products = add(door, products);
        System.out.println(Arrays.toString(products));
    }

    private static Product[] add(Product product, Product[] products) {
        int length = products.length;
        Product[] newArray = Arrays.copyOf(products, length + 1);
        newArray[length] = product;
        return newArray;
    }
}
