package generics.boundedwildcards;

import generics.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.List;

public class PersonLoader {

    private final RandomAccessFile file;

    public PersonLoader(File file) throws FileNotFoundException {
        this.file = new RandomAccessFile(file, "rw");
    }

    public Person load() throws ClassCastException {
        return new Person("x", 100);
    }


    /**
     * While getting something we call <? super Person>
     * @param people
     */
    public void loadAll(final List<? super Person> people) {

        Person person;
        while ((person = load()) != null) {
            people.add(person);
        }
    }
}
