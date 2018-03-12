package concurrencynmultithreading.synchronization;

public class Customer implements Runnable {

    private Cup cup;

    public Customer(Cup cup) {
        this.cup = cup;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            cup.drink();
        }
    }
}
