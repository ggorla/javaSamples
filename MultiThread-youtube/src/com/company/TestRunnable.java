package com.company;

public class TestRunnable  implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread task 2");
    }

    public static void main(String[] args) {
        TestRunnable t = new TestRunnable();
        Thread thread = new Thread(t);
        thread.start();
    }
}
