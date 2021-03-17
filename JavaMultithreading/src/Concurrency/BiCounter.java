package Concurrency;

public class BiCounter {
    private  int i = 0;
    private int j = 0;
    synchronized public void incrementi(){
        i++;
    }
    synchronized public void incrementj(){
        j++;
    }

    public int getI() {
        return i;
    }
}