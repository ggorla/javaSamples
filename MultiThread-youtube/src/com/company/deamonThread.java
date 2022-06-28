package com.company;

public class deamonThread extends  Thread{


    public void run() {
        System.out.println("child Thread");
    }

    public static void main(String[] args) {
        System.out.println("main Thread");
        deamonThread deamonThread = new deamonThread();
        deamonThread.setDaemon(true);
        deamonThread.start();
    }
}
