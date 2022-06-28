package com.company;
//perfomr single task from single thread
public class Case1 extends Thread {

    public void run(){
        System.out.println("Task 1");
    }

    public static void main(String[] args) {
        Case1 thread1 = new Case1();
        thread1.start();
    }
}
