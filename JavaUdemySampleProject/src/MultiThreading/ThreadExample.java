package MultiThreading;

public class ThreadExample {
    public static void main(String[] args) {
        //1. example this does not do anything other than start

        Thread thread = new Thread();
        thread.start();


        //2. Example to call the method which extends Thread
        MyThread myThread= new MyThread();
        myThread.start();

        //3. Example is to implment runnable for the class
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();

        //4. Anaonomoys class
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("Anaonomus is running");
                System.out.println("Ananomus Finshed");
            }
        };
        Thread thread2 = new Thread(runnable);
        thread2.start();

        //5. Lamda expresstion:
        Runnable runnable1=()->{
            System.out.println("Lamda is running");
            System.out.println("Lambda Finshed");
        };
        Thread thread3 = new Thread(runnable1);
        thread3.start();

        Runnable runnable2=()->{String threadName = Thread.currentThread().getName();
            System.out.println("current thread: "+threadName);};
        Thread thread4 = new Thread(runnable2,"runnable 2");
        thread4.start();
    }

    public static class MyThread extends Thread{
        public void run(){
            System.out.println("myThread is running");
            System.out.println("MyThread Finshed");
        }
    }

    public static class MyRunnable implements Runnable{
        @Override
        public void run(){
            System.out.println("MyRunning is running");
            System.out.println("MyRunning Finshed");
        }
    }
}
