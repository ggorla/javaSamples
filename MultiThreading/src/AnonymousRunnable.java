public class AnonymousRunnable {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside anonymous class");
            }
        };

        Thread thread= new Thread( runnable);
        thread.start();
    }
}
