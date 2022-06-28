package com.company;

public class interrupt extends  Thread{

    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println("Thread intruppted"+e);
        }
    }

    public static void main(String[] args) {
        interrupt t  =  new interrupt();
        t.start();
    }
}
