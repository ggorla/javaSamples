package com.company;



public class Case3 extends  Thread{
    public void run(){
        System.out.println("Task 1");
    }

    public static void main(String[] args) {
        Case3 thread1 = new Case3();
        thread1.start();

        Case3 thread2 = new Case3();
        thread2.start();
    }
}
