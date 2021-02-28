package MultiThreadingUdemy;

import javax.sound.midi.Soundbank;

import static MultiThreadingUdemy.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from MainThread");
        Thread anotherthread = new AnotherClass();
        anotherthread.setName("---Another Thread----");
        anotherthread.start();
        //
        //thread.interrupt();
        Thread myRunnable1 = new Thread(new MyRunnable());
        myRunnable1.start();
        Thread myRunnable = new Thread(new MyRunnable(){

            @Override
            public void run() {
                System.out.println(ANSI_GREEN+"Hello from Anonymous class");
                try{
                    anotherthread.join(2000);
                    System.out.println(ANSI_RED+"Another Thread Terminated so I am running again");
                }catch (InterruptedException e){
                    System.out.println(ANSI_RED+"Was intreptued");
                }


            }});
            myRunnable.start();
        System.out.println(ANSI_PURPLE+"Hello again from the main Thread");
    }
}
