package design.structural.proxy;

/**
 * WriteProductProxy class has write only access
 */
public class WriteProductProxy extends Product {

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Cant read. Write access only");
    }

    @Override
    public String getEmail() {
        throw new UnsupportedOperationException("Cant read. Write access only");
    }
}
