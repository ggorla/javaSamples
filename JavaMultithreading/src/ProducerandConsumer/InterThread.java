package ProducerandConsumer;

public class InterThread {
    public static void main(String[] args) {
        Q q = new Q();
        new producer(q);
        new consumer(q);

    }
}

class Q{
   int num;
    boolean valueSet = false;
    public synchronized void get() {
        while (!valueSet){
           try{ wait();} catch (Exception e){}
        }
        System.out.println("get: "+num);
        valueSet=false;
        notify();
    }

    public synchronized void put(int num)  {
        while (valueSet){
            try{wait();} catch (Exception e){}
        }
        System.out.println("put: "+num);
        this.num = num;
        valueSet=true;
        notify();
    }
}
class producer implements Runnable{
    Q q;

    public producer(Q q) {
        this.q = q;
        Thread t  = new Thread(this, "Producer");
        t.start();
    }
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class  consumer implements Runnable{
    Q q;

    public consumer(Q q) {
        this.q = q;
        Thread t  = new Thread(this, "Producer");
        t.start();
    }

    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}