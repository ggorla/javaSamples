package com.company;

public class yeild extends  Thread{

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("child thread "+i);
        }
    }

    public static void main(String[] args) {
        yeild thread =  new yeild();
        thread.start();
        Thread.yield();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread:"+i);
        }
    }
}
