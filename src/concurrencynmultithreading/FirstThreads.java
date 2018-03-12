package concurrencynmultithreading;

public class FirstThreads {

    private static volatile int counter = 0;
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("I am in a thread");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    counter += 1;
                    if (counter == 5) {
                        System.out.println("Exiting user thread");
                        break;
                    }
                }
            }
        }).start();
    }
}
