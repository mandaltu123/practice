package java8.incollections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PicckALongest {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("tim", "robbins", "jack" , "nicholson", "morgan", "freeman");
        final Optional<String> longName =
                names.stream()
                .reduce((name1, name2) ->
                    name1.length() >= name2.length() ? name1 : name2
                );
        longName.ifPresent(name ->
                System.out.println(String.format("A long name is %s ", name)));
    }
}
