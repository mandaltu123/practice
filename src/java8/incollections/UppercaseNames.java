package java8.incollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseNames {

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("james", "rodrigues", "paul", "maccurtney", "bob", "marley");
        List<String> collect = nameList.parallelStream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(collect.toString());

        List<String> newList = new ArrayList<>(nameList);
        List<Integer> collect1 = newList.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());
        System.out.println(collect1.toString());
    }
}
