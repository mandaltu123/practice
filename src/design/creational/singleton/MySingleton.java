package design.creational.singleton;

public enum MySingleton {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class SingletonTester {
    public static void main(String[] args) {
        MySingleton instance = MySingleton.INSTANCE;
        instance.setValue(100);
        System.out.println("The value is = " + instance.getValue());
    }
}
