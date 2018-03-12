package design.structural.proxy;

public class ProxyTester {

    public static void main(String[] args) {
        Product readAccess = AccessControl.getInstance(Access.READ);
        Product writeAccess = AccessControl.getInstance(Access.WRITE);
        try {
            readAccess.setEmail("test@test.com");
        } catch (UnsupportedOperationException e) {
            System.err.println(e.getMessage());
        }

        try {
            writeAccess.getName();
        } catch (UnsupportedOperationException e) {
            System.err.println(e.getMessage());
        }
    }
}
