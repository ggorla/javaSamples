package UdemyCave;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements  Runnable{
    private int id;

    public Processor(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Starting:"+id);
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){

        }
        System.out.println("Compleated: "+id);
    }
}
public class App {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(int i=0;i<5;i++){
            executorService.submit(new Processor(i));
        }
        executorService.shutdown();

        System.out.println("All tasks submited");
    }
}
