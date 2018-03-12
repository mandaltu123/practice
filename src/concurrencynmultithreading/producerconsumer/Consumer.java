package concurrencynmultithreading.producerconsumer;

public class Consumer implements Runnable {
    private Mug mug;

    public Consumer(Mug mug) {
        this.mug = mug;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            int value = mug.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Consumer value = "+ value);
        }
    }
}
