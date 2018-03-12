package concurrencynmultithreading.synchronization;

public class DecrementerThread implements Runnable {

    private Counter counter;

    public DecrementerThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println("decrementing...");
                counter.decrement();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
