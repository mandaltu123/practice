package generics;

public class TestRob extends TestPerson {

    public TestRob(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        TestPerson test = new TestRob("rob", 15);
        test.print();
    }
}
