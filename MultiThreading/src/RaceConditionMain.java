public class RaceConditionMain {
    public static void main(String[] args) {
        RaceCondition runnable = new RaceCondition();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
