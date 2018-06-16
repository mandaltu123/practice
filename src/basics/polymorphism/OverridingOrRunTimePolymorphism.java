package basics.polymorphism;

/**
 * Runtime polymorphism is implemented when we have a IS-A relationship between objects.
 * This is also called method overriding because subclasses will have to override the superclass
 * methods in order to achieve runtime polymorphism.
 * <p>
 * Look at the bellow example.
 */
public class OverridingOrRunTimePolymorphism {

    public static void main(String[] args) {

        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();

        triangle.draw();
        rectangle.draw();
    }
}

class Shape {

    public void draw() {
        System.out.println("drawing generic shape");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
