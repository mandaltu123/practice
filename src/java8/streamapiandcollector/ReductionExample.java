package java8.streamapiandcollector;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 12, 13);
        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);
        List<Integer> list1 = Arrays.asList(11, 12, 13);
        Optional<Integer> integer = list1.stream().reduce(Integer::max);
        System.out.println("The max is = " + integer.get());
    }
}
