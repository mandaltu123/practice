package java8.reference;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamTest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(
                numbers.parallelStream()
                        .mapToInt(ParallelStreamTest::doubleIt)
                        .sum());
    }

    private static int doubleIt(int number) {

        // introducing some delay
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return number * 2;
    }
}
