package design.structural.adapter;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterPattern {

    public static void main(String[] args) {
        // Arrays.asList(..) is an example of adapter pattern
        Integer[] ints = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> listOfInts = new ArrayList<>();
        listOfInts = Arrays.asList(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(listOfInts);

        System.out.println("*************************");
        System.out.println("*OUR CUSTOM ADAPTER HERE");
        System.out.println("*************************");

        EmployeeClient employeeClient = new EmployeeClient();
        List<Employee> employeeList = employeeClient.getEmployeeList();
        System.out.println(employeeList);
    }
}
