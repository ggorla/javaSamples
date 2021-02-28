package MultiThreadingUdemy;

public class MainMulti {
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

class  CountDown{
    int i;
    public synchronized void doCountDown(){

        String color;
        switch (Thread.currentThread().getName()){
            case "Threa 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
        }
        for( i =10; i>0;i--){
            System.out.println(color+Thread.currentThread().getName()+":i="+i);
        }
    }
}
class CountdownThread extends Thread{
    private CountDown threadCounddown;
    public CountdownThread(CountDown countDown){
        threadCounddown = countDown;
    }

    public void run(){
        threadCounddown.doCountDown();
    }
}
