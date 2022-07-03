package thread;

public class TheProblemWithMultiThread {

    public static int counter=0;

    //this solves the memory issues
    public static synchronized void increment(){
        counter++;
    }
    public static void process()  {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                  increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    increment();
                }
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }
        catch (Exception e){
            e.printStackTrace();}
        System.out.println("Counter is "+counter);
    }

    public static void main(String[] args) {

        process();
    }

    }

