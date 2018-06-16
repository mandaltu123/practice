package java8.incollections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PassingFunctionsToFunction {


    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(100.50, 39.99, 14.50, 200.50);

        List<Double> collect = prices.stream()
                .filter(price -> price.compareTo(Double.valueOf(50)) > 0)
                .map(price -> price * Double.valueOf(0.9))
                .collect(Collectors.toList());

        System.out.println(collect.toString());
    }
}
