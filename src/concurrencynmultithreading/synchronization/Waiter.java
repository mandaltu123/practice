package concurrencynmultithreading.synchronization;

public class Waiter implements Runnable {

    private Cup cup;

    public Waiter(Cup cup) {
        this.cup = cup;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            cup.pour();
        }
    }
}
