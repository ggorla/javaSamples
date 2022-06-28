package com.company;
class MyThread1 extends  Thread {
    public void run() {
        System.out.println("Task1");
    }
}
class MyThread2 extends  Thread {
    public void run() {
        System.out.println("Task1");
    }
}
public class Case4 {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        thread1.start();
        MyThread2 thread2 = new MyThread2();
        thread2.start();

    }
}
