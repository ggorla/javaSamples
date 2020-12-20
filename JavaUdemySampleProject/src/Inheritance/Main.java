package Inheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal",1,1,3,3);
        Dog dog = new Dog("yorkie",1,1,2,3,4,2,20,"silk");

        //dog.eat();
        //dog.run();
        dog.walk();
    }


}
