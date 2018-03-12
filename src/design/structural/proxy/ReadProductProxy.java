package design.structural.proxy;

/**
 * ReadPRoxy will have only read access
 */
public class ReadProductProxy extends Product {

    public ReadProductProxy() {
        super();
    }

    @Override
    public void setName(String name) {
       throw new UnsupportedOperationException("Cant set. Read access only");
    }

    @Override
    public void setEmail(String email) {
        throw new UnsupportedOperationException("Cant set. Read access only");
    }
}
