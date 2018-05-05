package concurrencynmultithreading.producerconsumer;

public class OddPrinterThread implements Runnable {

    private OddEven oddEven;

    public OddPrinterThread(OddEven oddEven) {
        this.oddEven = oddEven;
    }

    @Override
    public void run() {
        try {
            oddEven.oddPrinter();
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
