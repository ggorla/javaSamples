package thread;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class worker {

    private static int counter =0;
    private static Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void  produce() throws InterruptedException{
        lock.lock();
        System.out.println("Producer Method");
        condition.await();
        System.out.println("Afain the produxer Method");
    }

    public void consume() throws InterruptedException{
        Thread.sleep(2000);
        lock.lock();
    }
}
public class producerConsumerLock {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        Thread t2 =  new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
