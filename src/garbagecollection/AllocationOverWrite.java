package garbagecollection;

import java.util.Random;

public class AllocationOverWrite {

    public static void main(String[] args) throws InterruptedException {

        int arraySize = 1000000;
        GCMe[] gcMes = new GCMe[arraySize];
        int count = 0;
        Random random = new Random();
        while (true) {
            gcMes[random.nextInt(arraySize)] = new GCMe();
            if(count % 10000 == 0) {
                System.out.print(".");
            }
            count++;
           // Thread.sleep(1);
        }
    }
}

class GCMe{

    long a;
    long aa;
    long aaa;
    long aaaa;
    long aaaaa;
    long aaaaaa;
    long aaaaaaa;
    long aaaaaaaa;
    long aaaaaaaaa;
    long aaaaaaaaaa;
    long aaaaaaaaaaa;
    long aaaaaaaaaaaa;
    long aaaaaaaaaaaaa;
    long aaaaaaaaaaaaaa;
    long aaaaaaaaaaaaaaa;
    long aaaaaaaaaaaaaaaa;
    long aaaaaaaaaaaaaaaaa;
    long aaaaaaaaaaaaaaaaaa;
    long aaaaaaaaaaaaaaaaaaa;
}
