package misc;

public class AreaCalculator {
    public double area(double radius) {
        if(radius < 0) {
            return -1.0;
        }
        return 4 * 3.14 * radius * radius;
    }

    public double area(double x, double y) {
        if(x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }

    public static void main(String[] args) {

    }
}
