package design.aggregation;

import java.util.ArrayList;
import java.util.List;

public class School {


    private  String schoolName;
    private List<Department> departments;

    public School(String schoolName, List<Department> departments) {
        this.schoolName = schoolName;
        this.departments = departments;
    }

    public int getNumberOfStudents() {
        int numberOfStudents = 0;
        for (Department department: departments) {
            numberOfStudents += department.getStudents().size();
        }
        return numberOfStudents;
    }
}

class GFG {
    public static void main(String args[]) {
        Student s1 = new Student("Payal", "1", "CSE");
        Student s2 = new Student("Priya", "2", "CSE");
        Student s3 = new Student("John", "1", "EE");
        Student s4 = new Student("Rahul", "2", "EE");

        // making a List of
        // CSE Students.
        List <Student> cse_students = new ArrayList<>();
        cse_students.add(s1);
        cse_students.add(s2);

        // making a List of
        // EE Students
        List <Student> ee_students = new ArrayList<Student>();
        ee_students.add(s3);
        ee_students.add(s4);

        Department CSE = new Department("CSE", cse_students);
        Department EE = new Department("EE", ee_students);

        List <Department> departments = new ArrayList<Department>();
        departments.add(CSE);
        departments.add(EE);

        // creating an instance of Institute.
        School institute = new School("BITS", departments);

        System.out.print("Total students in institute: ");
        System.out.print(institute.getNumberOfStudents());
    }
}
