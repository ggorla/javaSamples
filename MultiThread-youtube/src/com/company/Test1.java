package com.company;

public class Test1 extends Thread {
    public  void run(){
        System.out.println("Thread Task");
    }

    public static void main(String[] args) {
        Test T = new Test();
        T.start();

        Test T2 = new Test();
        T2.start();
    }
}
