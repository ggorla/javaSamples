package thread;

class DaemonWorker implements Runnable{
    @Override
    public void run() {

      while(true) { try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("From Thread");
    }}
}

class  NormalWorker  implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("NormalWorker");
    }
}
public class DeamonThread {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();

        Thread t1 = new Thread(new DaemonWorker());
        Thread t2 = new Thread(new NormalWorker());
        t1.setDaemon(true);
        t1.start();
        t2.start();

        System.out.println(t1.isDaemon());
    }
}
