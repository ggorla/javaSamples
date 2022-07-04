package thread;
class Worker implements Runnable{
    private boolean terminated;
    @Override
    public void run() {

        while (!terminated){
            System.out.println("Working Class is running");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
        public  boolean isTerminated(){
            return terminated;}
    public void setTerminated(boolean terminated){
        this.terminated=terminated;
    }
}
public class Volatile {

    public static void main(String[] args) {
        Worker worker = new Worker();
        Thread t1 =  new Thread(worker);
        t1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        worker.setTerminated(false);
        System.out.println("Algorithm is Terminated...");
    }
}
