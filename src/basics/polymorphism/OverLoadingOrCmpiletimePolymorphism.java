package basics.polymorphism;

/**
 * Polymorphism is the concept where an object behaves differently in different situations
 * There are two types of polymorphism – compile time polymorphism and runtime polymorphism.
 */
public class OverLoadingOrCmpiletimePolymorphism {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.draw(100);
        circle.draw(50, "Deep Purple");
    }
}

/**
 * Method overloading is also known as compile time polymorphism.
 * Compiler knows based on the parameter passed what method to be invoked at compile time itself
 */
class Circle {
    public void draw() {
        System.out.println("Drawing circle with defaults");
    }

    public void draw(int diameter) {
        System.out.println("Drawing circle with diameter: " + diameter);
    }

    public void draw(int diameter, String color) {
        System.out.println("Drawing circle with diameter " + diameter + " and color " + color);
    }
}