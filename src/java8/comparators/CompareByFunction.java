package java8.comparators;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CompareByFunction {

    private static Function<Person, Integer> byAge = person -> person.getAge();
    private static Function<Person, String> byName = person -> person.getName();
    private static Predicate<Person> greaterThan20 = person -> person.getAge() > 25;

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("test").append("mail");
        sb.reverse().toString().toLowerCase();

        String test = "teststring";
//        test.substring(0, )
        test.replace("t", "x");


        List<Person> personList = Arrays.asList(new Person("Jenny", 23),
                new Person("Forest", 25),
                new Person("Bubba", 28),
                new Person("Lt. Dan", 35));

        List<Person> collect = personList.stream()
                .sorted(Comparator.comparing(byAge).thenComparing(byName))
                .collect(Collectors.toList());

        System.out.println(collect.toString());

        // greater than 25 case
        List<Person> greateThan25List = personList.stream()
                .filter(greaterThan20)
                .collect(Collectors.toList());

        System.out.println(greateThan25List.toString());


    }
}
