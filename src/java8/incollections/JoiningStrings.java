package java8.incollections;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class JoiningStrings {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("tim", "robbins", "jack", "nicholson", "morgan", "freeman");
        System.out.println(
                names.stream()
                        .map(String::toUpperCase)
                        .collect(joining(", "))
        );
    }
}
