
class  runner1  implements Runnable{
    @Override
    public void run() {

    for (int i = 0; i < 10; i++) {
            System.out.println("Runner 1 " + i);
        }
    }
}
    class runner2   implements Runnable{
        @Override
        public void run() {

            for (int i = 0; i < 10; i++) {
                System.out.println("Runner 2 " + i);
            }
        }
    }
public class app {
    public static void main(String[] args) {
        Thread thread1= new Thread(new runner1());
        Thread thread2= new Thread(new runner2());
        thread1.start();
        thread2.start();

    }}