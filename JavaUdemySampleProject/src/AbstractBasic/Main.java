package AbstractBasic;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorki");
        dog.breathe();
        dog.eat();


        Parrot bird = new Parrot("Parrot");
        bird.fly();
        bird.breathe();
        bird.eat();

    }
}
