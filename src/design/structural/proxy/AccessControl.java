package design.structural.proxy;

public class AccessControl {

    public static Product getInstance(Access access) {

        switch (access) {
            case READ: return new ReadProductProxy();
            case WRITE: return new WriteProductProxy();
            default: throw new UnsupportedOperationException("Do not have right access");
        }
    }
}
