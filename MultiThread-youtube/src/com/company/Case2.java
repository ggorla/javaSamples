package com.company;

class Testtest extends Thread{
    public void run(){
        System.out.println("Thread Task ");
    }
}

public class Case2 {
    public static void main(String[] args) {
        Testtest thread2 = new Testtest();
        thread2.start();
    }
}
