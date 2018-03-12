package java8.streamapiandcollector;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamsIntroduction {



    public static void main(String[] args) {
        List<Person> personList = getPeople();
        //compute the average age of people in the list older than 20
        //step 1: mapping
        //mapping stage takes a list and returns list<Integer>
        //the size of the list is the same

        // step 2. filtering step takes a list<Integer> and returns a list<Integer>
        //but there are some data which are filtered out in the process


        // step 3. Reduction
        // this step is equivalent of SQL aggregation

        /**
         * First we will check how to use streams
         * then we will check how to filter on stream objects
         */

        Stream<Person> stream = personList.stream();
        Stream<Person> stream1 = personList.stream();
        //prints all the elements form stream

        //Consumer is a functional interface
        Consumer<Person> c = p -> System.out.println(p);
        // can also be written as a method reference
        Consumer<Person> consumer = System.out::println;
        stream.forEach(c);
        stream1.forEach(consumer);


        /**
         * Chaining consumers
         */
        List<String> list = new ArrayList<>();
        list.add("my");
        list.add("name");
        list.add("is");
        list.add("tuhin");

        List<String> result = new ArrayList<>();
        Consumer<String> c1 = result::add;
        Consumer<String> c2 = System.out::println;
        Consumer<String> c3 = c1.andThen(c2);

        Stream<String> stringStream = list.stream();
        stringStream.forEach(c3);

    }

    /**
     * Kept it public as I want to be able to get list of persons from some other examples as well
     * @return
     */
    public static List<Person> getPeople() {
        List<Person> personList = new ArrayList<>();
        Person rob = new Person("Rob", 10);
        Person angus = new Person("Angus", 67);
        Person steve = new Person("Steve", 50);
        personList.add(rob);
        personList.add(angus);
        personList.add(steve);
        return personList;
    }

}
