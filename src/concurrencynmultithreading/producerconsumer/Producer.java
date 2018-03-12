package concurrencynmultithreading.producerconsumer;

public class Producer implements Runnable {

    private Mug mug;

    public Producer(Mug mug) {
        this.mug = mug;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            mug.put(i);
            System.out.println("Producer: put =" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
