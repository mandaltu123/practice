package java8.incollections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("tim", "robbins", "anna", "hathway", "tom", "hardy");
        List<String> collect = nameList.stream()
                .filter(name -> name.startsWith("t"))
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(collect.toString());
    }
}
