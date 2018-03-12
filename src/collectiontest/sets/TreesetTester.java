package collectiontest.sets;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetTester {
    public static void main(String[] args) {
        Employee rob = new Employee("Rob Chappman", 100);
        Employee lee = new Employee("Captain Lee", 101);
        Employee lee1 = new Employee("Stan Lee", 102);

        SortedSet<Employee> treeset = new TreeSet<>();
        treeset.add(rob);
        treeset.add(lee);
        treeset.add(lee1);

        treeset.forEach(employee -> System.out.println(employee.getName()));
    }
}
