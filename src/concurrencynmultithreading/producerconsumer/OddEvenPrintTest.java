package concurrencynmultithreading.producerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class OddEvenPrintTest {

    public static void main(String[] args) throws InterruptedException {
        OddEven oddEven = new OddEven();
        OddPrinterThread oddPrinterThread = new OddPrinterThread(oddEven);
        EvenPrinterThread evenPrinterThread = new EvenPrinterThread(oddEven);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(oddPrinterThread);
        executorService.execute(evenPrinterThread);

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}
