package generics.boundedwildcards;


import generics.Employee;
import generics.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.List;

public class PersonSaver {

    private final RandomAccessFile file;

    public PersonSaver(File file) throws FileNotFoundException {
        this.file = new RandomAccessFile(file, "rw");
    }

    public void save(Person person) throws ClassCastException {

    }

    /**
     * This is an example of upper bounded wildcards
     * SaveAll method takes any type of partners as long as they are Person objects or any object that is
     * extended from Person.
     *
     * There is another version of this code in anotherSaveAll(...) but that looks slightly clumsier, so better use
     * saveAll version
     *
     * while putting we do <? extends Person>
     *
     * @param partners
     */
    public void saveAll(List<? extends Person> partners) {

    }


    public <T extends Person> void anotherSaveAll(List<T> partners) {

    }




}
