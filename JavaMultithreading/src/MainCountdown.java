public class MainCountdown {
    public static void main(String[] args) {
        CountDown countDown = new CountDown();
        CountdownThread t1 = new CountdownThread(countDown);
        t1.setName("Thread 1");

        CountdownThread t2 = new CountdownThread(countDown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }

}

class CountDown{
        int   i;
    //public synchronized void  doCountDown(){
    public  void  doCountDown(){
        String color;
        switch (Thread.currentThread().getName()){
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
                break;
        }
        //synchronized (color) {
        synchronized (this) {
            for (i = 0; i < 10; i++) {
                System.out.println(color + Thread.currentThread().getName() + " i: " + i);
            }
        }
    }
}

class CountdownThread  extends Thread{

    private CountDown countDown;

    public CountdownThread(CountDown countDown) {
        this.countDown = countDown;
    }

    @Override
    public void run() {
        countDown.doCountDown();
    }
}