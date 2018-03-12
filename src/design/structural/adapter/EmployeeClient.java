package design.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmpployeeDB("100", "Angus", "Young", "angus@acdc.com");
        employees.add(employeeFromDB);
        EmployeeOldType oldTypeEmployee = new EmployeeOldType("001", "Bon", "Scott", "bonscott@acdc.com");
        employees.add(new EmployeeAdapter(oldTypeEmployee));
        return employees;
    }
}
