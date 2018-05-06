package design.aggregation;

import java.util.List;

public class Department {
    private String departmentName;
    private List<Student> students;

    public Department(String departmentName, List<Student> students) {
        this.departmentName = departmentName;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}
