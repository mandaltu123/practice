package concurrencynmultithreading.concurrencypatterns;

import java.util.concurrent.*;

public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> task = () -> doSomething();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(task);
        String result = future.get();
        System.out.println("the result returned by future is " + result);
        executorService.shutdown();
    }

    private static String doSomething() throws InterruptedException {
        System.out.println("simulating some process that takes 2000 ms to execute .......");
        Thread.sleep(2000);
        return "Done Something";
    }

}
