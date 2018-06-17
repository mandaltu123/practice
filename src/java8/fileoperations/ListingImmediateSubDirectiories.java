package java8.fileoperations;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListingImmediateSubDirectiories {

    /**
     * We earlier saw how to list the members of a given directory.
     * Let's look at the effort to explore the immediate one level deep subdirectories
     * @param args
     */
    public static void main(String[] args) {

        List<File> collect = Stream.of(new File("/home/tuhin/programming/mygits/practice").listFiles())
                .flatMap(file -> file.listFiles() == null ?
                        Stream.of(file) : Stream.of(file.listFiles()))
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
