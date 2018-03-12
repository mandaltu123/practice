package basics;

public class ConstructorCreation {

    private int id = 0;
    private static ConstructorCreation test = null;
    private static ConstructorCreation test1 = null;

    public ConstructorCreation(int id) {
        checkID(id);
        this.id = id;
    }

    private void checkID(int id) {
        if (id < 100 || id > 200)
        throw new IllegalArgumentException("Not a valid id");
    }

    public static void main(String[] args) {
        try {
            test = new ConstructorCreation(500);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            test1 = new ConstructorCreation(120);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(test1);
    }
}
