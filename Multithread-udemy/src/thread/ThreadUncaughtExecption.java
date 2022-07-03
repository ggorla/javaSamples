package thread;

public class ThreadUncaughtExecption {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("Intentioanl Execption");
            }
        });
        thread.setName("MisBehaving thread");
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("A Critical Error Happened in thred"+t.getName()+"The Error is"+e.getMessage());
            }
        });
    }
}
