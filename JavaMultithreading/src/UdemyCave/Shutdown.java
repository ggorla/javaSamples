package UdemyCave;

import java.util.Scanner;

class Processer extends Thread{
    boolean running = true;
    void Run(){
        while (running){
            System.out.println("hello I am here");
        }
    }
    public void shutdown(){
        running  = false;
    }
}
public class Shutdown {
    public static void main(String[] args) {
        Processer proc1 = new Processer();
        proc1.start();

        Scanner scnner  = new Scanner(System.in);
        scnner.nextLine();

        proc1.shutdown();

    }
}
