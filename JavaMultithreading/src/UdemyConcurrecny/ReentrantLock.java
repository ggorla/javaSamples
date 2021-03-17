package UdemyConcurrecny;

import java.util.concurrent.locks.Lock;

public class ReentrantLock {

    private static int counter = 0;
    private static Lock lock = new java.util.concurrent.locks.ReentrantLock();

    public static void increment(){
        counter++;
    }
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                increment();
            }
        });
    }
}
