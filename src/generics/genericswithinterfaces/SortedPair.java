package generics.genericswithinterfaces;

/**
 * Example of type bound
 * This class is a kind of pair comparison.
 *
 * If idea is to first slot shoud be small second slot should be more (in terms of values)
 * @param <T>
 */
public class SortedPair<T extends Comparable<T>> {

    private final T first;
    private final T second;

    public SortedPair(T left, T right) {
        if(left.compareTo(right) < 0) {
            this.first = left;
            this.second = right;
        } else {
            this.first = right;
            this.second = left;
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
