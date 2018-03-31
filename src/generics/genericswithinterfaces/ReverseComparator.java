package generics.genericswithinterfaces;


import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {

    private final Comparator<T> delegateComparator;

    public ReverseComparator(Comparator<T> delegateComparator) {
        this.delegateComparator = delegateComparator;
    }

    /**
     * We did multiply by -1 because we would like to sort the persons based on there age in descending order
     * @param left
     * @param right
     * @return
     */
    @Override
    public int compare(T left, T right) {
        return -1* delegateComparator.compare(left, right);
    }
}
