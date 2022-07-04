package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {
    public static AtomicInteger counter = new AtomicInteger(0);

    public void increment(){
        for (int i = 0; i < 10000; i++) {
            counter.getAndIncrement();
        }
    }
}
