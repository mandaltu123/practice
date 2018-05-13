package basics.diamondproblem;

public interface C extends A {
    default void m() {
        System.out.println("In interface C");
    }
}
