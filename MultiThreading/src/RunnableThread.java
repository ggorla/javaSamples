public class RunnableThread {

    public static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("in side the runnable");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
