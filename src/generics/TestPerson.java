package generics;

public class TestPerson {

    String name;
    int age;

    public TestPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("This is printed from parent class");
    }
}
