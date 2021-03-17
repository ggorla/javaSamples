package UdemyConcurrecny;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Deadlock {
    private Lock lock1 = new ReentrantLock(true);
    private Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) {
        Deadlock deadlock= new Deadlock();
        new Thread(deadlock:: worker1,"worker1").start();

    }
    public void worker1(){
        lock1.lock();
        System.out.println("Worker1 aquires the lock1");
        try{
            Thread.sleep(300);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        lock2.lock();
        System.out.println("Worker1 aquired lock2");
    }
}
