public class ExtendsThread {
    public static void main(String[] args) {
        myThread myThread = new myThread();
        myThread.start();

    }
    public static class myThread extends Thread{
        public void run(){
            System.out.println("Runnable thread");
        }
    }
}
