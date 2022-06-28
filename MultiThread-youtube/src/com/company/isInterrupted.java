package com.company;

public class isInterrupted extends  Thread{

    public void run() {
        //as main thread is interrupted  flag is true and then sets to false
        System.out.println(Thread.interrupted());

        //as main thread is interrupted  flag is true will not change to false
        System.out.println(Thread.currentThread().isInterrupted());

        try{
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }

        }catch (Exception e){
            System.out.println("Thread Interrupted");
        }

    }

    public static void main(String[] args) {
        isInterrupted t = new isInterrupted();
        t.start();
        t.interrupt();
    }
}
