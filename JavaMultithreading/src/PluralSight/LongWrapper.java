package PluralSight;

public class LongWrapper {
    private long l;

    public LongWrapper(long l) {
        this.l = l;
    }

    public long getL() {
        return l;
    }
    public void incrementValue(){
        synchronized (this) {
            l = l + 1;
        }
    }
}
