package multiThreading;

public class AndroidThreadTest implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("starting"+ Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                System.out.println("i love Android");
                Thread.sleep(200);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        System.out.println("Ending"+ Thread.currentThread().getName());
    }
}
