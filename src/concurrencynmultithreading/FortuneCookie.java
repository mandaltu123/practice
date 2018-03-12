package concurrencynmultithreading;

public class FortuneCookie extends Thread {
    private String first;
    private String last;
    private int sleepyTime;


    public FortuneCookie(String first, String last, int sleepyTime) {
        this.first = first;
        this.last = last;
        this.sleepyTime = sleepyTime;
    }

    @Override
    public void run() {
       while (true) {
           System.out.print(first);
           try {
               Thread.sleep(sleepyTime);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println(last);
       }
    }
}
