package thread;

class Runner1 extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Runner1"+i);

        }
    }
}

class Runner2 extends  Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Runner2"+i);

        }
    }
}
public class ThreadExtend {



    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Runner1();
        Thread thread2 = new Runner2();
        thread1.start();
        thread2.start();

        thread1.join();

        System.out.println("Finished the running");
    }
}
