package com.company;

public class TreadNameDemo extends Thread{

    public void run(){
        System.out.println("Thread task");
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        Thread.currentThread().setName("Gautham");

        TreadNameDemo t1 = new TreadNameDemo();
        t1.start();

        System.out.println(10/0);
    }
}
