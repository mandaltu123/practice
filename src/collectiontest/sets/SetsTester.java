package collectiontest.sets;

import java.util.HashSet;
import java.util.Set;

public class SetsTester {

    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<>();
        Employee rob = new Employee("Rob Chappman", 100);
        Employee lee = new Employee("Captain Lee", 101);
        Employee lee1 = new Employee("Stan Lee", 101);//trying to simulate duplicate employee based on the
        // employee id

        employeeSet.add(rob);
        employeeSet.add(lee);
        employeeSet.add(lee1);

        employeeSet.forEach(employee -> System.out.println(employee.getId() + " " + employee.getName()));
        /**
         * this will print
         * 100 Rob Chappman
         101 Captain Lee

         stan lee will not be printed as it will be considered as same object
         */
    }
}
