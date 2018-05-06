package generics.boundedwildcards;

import generics.Employee;
import generics.Partner;
import generics.Person;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PersonStorageTest {

    private Partner donDrapper = new Partner("Don Drapper", 89);
    private Partner bertCooper = new Partner("Bert Cooper", 100);
    private Employee peggyOlsen = new Employee("Peggy Olsen", 65);

    private File file;
    private PersonLoader personLoader;
    private PersonSaver personSaver;


    /**
     * Don't worry about running the tests, look at saveAll method
     * @throws Exception
     */

    @Test
    public void savesAndLoadsPerson() throws Exception {
        Person bob = new Person("Bob", 20);
        personSaver.save(bob);
        assert equals(personLoader.load());
    }

    @Test
    public void saveAllImplementation() {
        Person bob = new Person("bob", 20);
        Partner rob = new Partner("rob", 25);
        Employee steve = new Employee("judy", 21);

        List<Employee> employees = new ArrayList<>();
        List<Partner> partners = new ArrayList<>();
        List<Person> persons = new ArrayList<>();
        persons.add(bob);
        partners.add(rob);
        employees.add(steve);
        personSaver.saveAll(employees);
        personSaver.saveAll(partners);
        personSaver.saveAll(persons);
        personSaver.anotherSaveAll(partners);
    }

    public void loadAllPersons() {
        personSaver.save(donDrapper);
        personSaver.save(peggyOlsen);

        List<Object> people = new ArrayList<>();
        people.add(donDrapper);
        people.add(peggyOlsen);

        personLoader.loadAll(people);
    }


}
