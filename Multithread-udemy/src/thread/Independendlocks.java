package thread;

public class Independendlocks {
    public static int counter1=0;
    public static int counter2=0;
    //this solves the memory issues
    public  static final Object lock1 = new Object();
    public  static final Object lock2 = new Object();

    public static  void increment1(){
        synchronized (lock1) {
            counter1++;
        }
    }

    public static void process() {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    increment1();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    increment1();
                }
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Counter is " + counter1);
    }

    public static void main(String[] args) {
        process();
    }
}
