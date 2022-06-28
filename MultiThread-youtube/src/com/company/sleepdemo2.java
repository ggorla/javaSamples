package com.company;

public class sleepdemo2 extends  Thread{

    public void run() {
        try{
        for (int i=1;i<=5;i++){
            System.out.println(i +" "+ Thread.currentThread().getName());
            Thread.sleep((3));
        }} catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        sleepdemo2 thread = new sleepdemo2();
        thread.run();

        sleepdemo2 thread2 = new sleepdemo2();
        thread2.start();
    }
}
