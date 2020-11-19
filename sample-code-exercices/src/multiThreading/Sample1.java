package multiThreading;

public class Sample1  {
    public static void main(String[] args) {
        CreateJavaThread();
        CreateJavaFxThread();
        CreateAndoridThread();
    }

    private static void CreateJavaThread() {
        JavaThreadTest threadTest = new JavaThreadTest();
        Thread th = new Thread(threadTest);
        th.setName("Java thread");
        th.start();
    }

    private static void CreateJavaFxThread() {
        JavaFXThread threadTest = new JavaFXThread();
        Thread th = new Thread(threadTest);
        th.setName("JavaFX thread");
        th.start();
    }

    private static void CreateAndoridThread() {
        AndroidThreadTest threadTest = new AndroidThreadTest();
        Thread th = new Thread(threadTest);
        th.setName("JavaFX thread");
        th.start();
    }

}
