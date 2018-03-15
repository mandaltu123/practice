package java8.lambdas;


import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> extends java.util.Comparator<T> {

    int compare(T t1, T t2);


    public static <U> Comparator<U> comparing(Function<U, Comparable> f) {
        return ((p1, p2) -> f.apply(p1).compareTo(f.apply(p2)));
    }

}
