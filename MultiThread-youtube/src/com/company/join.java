package com.company;

public class join extends  Thread{


    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Main Thread "+i);}
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args)  throws InterruptedException{
        join t = new join();
        t.start();
        t.join();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Main Thread "+i);

            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
