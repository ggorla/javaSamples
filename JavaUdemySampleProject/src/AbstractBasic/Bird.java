package AbstractBasic;

public abstract class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("picking");
    }

    @Override
    public void breathe() {
        System.out.println("Bird breathing");

    }
    public abstract void fly();
}
