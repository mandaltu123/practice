package java8.incollections;

import java.util.Arrays;
import java.util.List;

public class ReducingCollection {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("tim", "robbins", "jack" , "nicholson", "morgan", "freeman");

        int sum = names.stream()
                .mapToInt(name -> name.length())
                .sum();

        System.out.println("count of all characters in all names = " + sum);
    }
}
