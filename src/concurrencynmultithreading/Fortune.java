package concurrencynmultithreading;

public class Fortune extends Thread {

    private String first;
    private String last;
    private int sleepyTime;


    public Fortune(String first, String last, int sleepyTime) {
        this.first = first;
        this.last = last;
        this.sleepyTime = sleepyTime;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Good things will come your way");
        }
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getSleepyTime() {
        return sleepyTime;
    }

    public void setSleepyTime(int sleepyTime) {
        this.sleepyTime = sleepyTime;
    }
}
