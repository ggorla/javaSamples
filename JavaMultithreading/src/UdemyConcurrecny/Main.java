package UdemyConcurrecny;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread runner1 = new Thread(new Runner1());
        Thread runner2 = new Thread(new Runner2());
        runner1.start();
        runner2.start();
        runner1.join();
        runner2.join();
        System.out.println("Finished with Threads....");
    }
}
class Runner1 implements Runnable{
    @Override
    public void run() {
        for (int i =0; i<10;i++){
            System.out.println("Runner 1: "+i);
        }
    }
}
class Runner2 implements Runnable{

    @Override
    public void run() {
        for (int i =0; i<10;i++){
            System.out.println("Runner 2: "+i);
        }
    }
}
