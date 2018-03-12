package concurrencynmultithreading.synchronization;

public class IncrementerThread implements Runnable {

    private Counter counter;


    public IncrementerThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Incrementing");
                counter.increment();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
