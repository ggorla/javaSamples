package thread;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLocks {

    private Lock lock1 = new ReentrantLock(true);

    private Lock lock2 = new ReentrantLock(true);

    public static void main(String[] args) {
        DeadLocks deadLocks = new DeadLocks();
        new Thread(deadLocks::worker1, "worker1").start();

        new Thread(deadLocks::worker2, "worker2").start();
    }
    public void  worker1(){
        lock1.lock();
        System.out.println("Worker 1 acquires the lock");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock2.lock();
        System.out.println("WOrker 1 Aquired the lock2..");
        lock1.unlock();
        lock2.unlock();
    }
    public void  worker2(){
        lock2.lock();
        System.out.println("Worker 2 acquires the lock 1");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock1.lock();
        System.out.println("WOrker 2 Aquired the lock2..");
        lock1.unlock();
        lock2.unlock();
    }
}
