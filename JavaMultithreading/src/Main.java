public class Main {
    public static void main(String[] args) {

        System.out.println(ThreadColor.ANSI_PURPLE+"hello from main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== another Thread====");
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ThreadColor.ANSI_GREEN+"hello from ananomys thred");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();
        //anotherThread.interrupt();

        Thread myRunnableAnanmous = new Thread( new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED+"in Ananomus class");
                try {
                    anotherThread.join(1000);
                    System.out.println(ThreadColor.ANSI_RED+"Another Thread Terminated");

                } catch (InterruptedException e) {
                    System.out.println(ThreadColor.ANSI_RED+"I codnt wait after all");
                }
            }
        });

        myRunnableAnanmous.start();
    }
}
