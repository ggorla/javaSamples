package thread;

public class creation {
    public static void main(String[] args) {
        Thread thread = new Thread((new Runnable() {
            @Override
            public void run() {
                System.out.println("We are now in Thread"+Thread.currentThread().getName());
            }
        }));

        thread.setName("New Worker Thread");
        System.out.println("we are in thread "+ Thread.currentThread().getName()+" before starting a new Thread");
        thread.start();
        System.out.println("we are in Thread "+Thread.currentThread().getName());
    }

}
