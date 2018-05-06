package generics.genericswithinterfaces;


import org.junit.Test;

/**
 * One thing to notice that we have not declared anything Comparable but how it is still working ?
 * It is because we Created pair of type Integer. Integer class implements Comparable.
 */
public class SortedOrderTest {

    @Test
    public void shouldRetainOrderOfOrderedPair() {
        SortedPair<Integer> pair = new SortedPair<>(1, 2);
        /*assert
        Assertions.assertEquals(1, pair.getFirst().intValue());
        Assertions.assertEquals(2, pair.getSecond().intValue());*/
    }

    @Test
    public void shouldFlipOrderOfUnorderedPair() {
        SortedPair<Integer> pair = new SortedPair<>(2, 1);
       /* Assertions.assertEquals(1, pair.getFirst().intValue());
        Assertions.assertEquals(2, pair.getSecond().intValue());*/
    }
}
