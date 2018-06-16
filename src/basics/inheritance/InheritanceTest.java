package basics.inheritance;

/**
 * Inheritance in an object oriented programming is a concept where one object is based on another object.
 * Inheritance is a mechanism of code re use. The object that is inheriting is called child class or sub class
 * and from which it is inheriting is called parent class or super class.
 *
 * We Use extends key word for the bellow example:
 */
public class InheritanceTest {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.foo();
        childClass.bar();
    }

}

class SuperClass {
    public void foo() {
        System.out.println("foo() in super class");
    }
}

class ChildClass extends SuperClass {

    public void bar() {
        System.out.println("bar() from child class");
    }
}
