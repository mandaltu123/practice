package basics.diamondproblem;

public interface B extends A {
    default void m() {
        System.out.println("In interface B");
    }
}
