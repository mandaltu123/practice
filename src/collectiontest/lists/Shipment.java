package collectiontest.lists;

import collectiontest.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Shipment implements Iterable<Product> {

    private static final int LIGHT_VAN_MAX_WEIGHT = 20;

    private final List<Product>  products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Product> action) {

    }

    @Override
    public Spliterator<Product> spliterator() {
        return null;
    }
}
