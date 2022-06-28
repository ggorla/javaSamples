package com.company;

public class joinchild extends Thread {

 static  Thread threadmain ;
    public void run() {
        try {
            threadmain.join();
            for (int i = 0; i <5 ; i++) {
                System.out.println("child Thread");
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        joinchild thread = new joinchild();
        threadmain= Thread.currentThread();
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main Thread"+i);
        }
    }
}
