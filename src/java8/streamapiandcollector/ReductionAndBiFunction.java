package java8.streamapiandcollector;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * There are two kinds of reduction functions available in stream api
 * 1st aggregation: min, max, sum
 * */
public class ReductionAndBiFunction {


    public static void main(String[] args) {
        List<Integer> ages = Arrays.asList(22, 24, 55, 33, 12);
        Stream<Integer> stream = ages.stream();
        Integer sum = stream.reduce(0, (age1, age2) -> age1 + age2);
        System.out.println(sum);
        // max
        List<Integer> ages1 = Arrays.asList(22, 24, 55, 33, 12);
        Stream<Integer> stream1 = ages1.stream();
        Optional<Integer> max = stream1.max(Comparator.naturalOrder());
        Integer integer = max.get();
        System.out.println("max value is = " + integer);
    }
}
