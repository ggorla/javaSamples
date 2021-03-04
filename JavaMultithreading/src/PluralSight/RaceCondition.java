package PluralSight;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        LongWrapper longWrapper = new LongWrapper(0l);
        Runnable r = ()->{
            for(int i =0;i<1_000;i++){
                longWrapper.incrementValue();
            }
        };
       /* Thread t = new Thread(r);
        t.start();
        t.join();
        System.out.println("value = "+ longWrapper.getL());


        */

        Thread[] threads = new Thread[1_000];
        for(int i =0; i<threads.length;i++){
            threads[i] = new Thread(r);
            threads[i].start();
        }
        for(int i = 0; i<threads.length ;i++){
            threads[i].join();
        }
        System.out.println("value"+longWrapper.getL());
    }
}
