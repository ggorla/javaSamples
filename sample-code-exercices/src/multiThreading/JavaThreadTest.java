package multiThreading;

public class JavaThreadTest  implements Runnable{

    @Override
    public void run() {
        System.out.println("starting"+ Thread.currentThread().getName());
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("i love java");
                Thread.sleep(200);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        System.out.println("Ending"+ Thread.currentThread().getName());
    }
}
