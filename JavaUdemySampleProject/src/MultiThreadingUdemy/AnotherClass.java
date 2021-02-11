package MultiThreadingUdemy;

import static MultiThreadingUdemy.ThreadColor.ANSI_BLUE;

public class AnotherClass  extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE+Thread.currentThread().getName());
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            System.out.println(ANSI_BLUE+"Another thread  woke me up");
            return;
        }
        System.out.println(ANSI_BLUE+"Three seconds have passed and I am awake");
    }
}
