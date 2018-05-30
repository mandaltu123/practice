package concurrencynmultithreading.concurrencypatterns;

public class RunnableTask {

    public static void main(String[] args) {

        Runnable task = () -> System.out.println("Hello world");
        Thread thread = new Thread(task);
        thread.start();

        /**
         * This is a bad way of programming
         * Here the user/developer is creating the thread. In this manner an user can create thousands of threads
         * but, threads are limited by operating system
         *
         * Executor pattern is the way to fix this problem.
         */
    }
}
