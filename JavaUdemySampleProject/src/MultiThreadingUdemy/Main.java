package MultiThreadingUdemy;

import javax.sound.midi.Soundbank;

import static MultiThreadingUdemy.ThreadColor.ANSI_CYAN;
import static MultiThreadingUdemy.ThreadColor.ANSI_RED;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from MainThread");
        Thread thread = new AnotherClass();
        thread.setName("---Another Thread----");
        thread.start();
        //
        //thread.interrupt();
        Thread myRunnable = new Thread(new MyRunnable(){

            @Override
            public void run() {
                System.out.println(ANSI_RED+"Hello from Anonymous class");
                    try {
                        thread.join();
                        System.out.println(ANSI_RED+"Joining thread");
                    } catch (InterruptedException e) {
                        System.out.println(ANSI_RED+"I coudnt wait after all");
                    }

            }});
            myRunnable.start();
        System.out.println(ANSI_CYAN+"Hello again from the main Thread");
    }
}
