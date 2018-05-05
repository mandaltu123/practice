package concurrencynmultithreading.producerconsumer;

public class EvenPrinterThread implements Runnable {

    private OddEven oddEven;

    public EvenPrinterThread(OddEven oddEven) {
        this.oddEven = oddEven;
    }

    @Override
    public void run() {
        try {
            oddEven.evenPrinter();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
