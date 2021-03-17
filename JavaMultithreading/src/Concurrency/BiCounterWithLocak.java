package Concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLocak {
    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();

    Lock lockforI = new ReentrantLock();
    Lock lockforJ = new ReentrantLock();
    synchronized public void incrementi(){
        i.incrementAndGet();
    }
    synchronized public void incrementj(){
        j.incrementAndGet();
    }

    public int getI() {
        return i.get();
    }
}