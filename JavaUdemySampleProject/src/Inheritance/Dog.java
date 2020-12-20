package Inheritance;

public class Dog extends Animal {
    private  int eyes;
    private  int legs;
    private  int teeth;
    private  String coat;
    public Dog(String name, int brain, int body, int size, int weight, int legs, int eyes, int teeth,String coat)  {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat called");
        chew();
        super.eat();
    }

    private  void chew(){
        System.out.println("dog.chew called");

    }
    public  void  walk(){
        System.out.println("Dog walk called");
        super.move(5);
    }
    public void  run(){
        System.out.println("Dog run called");
        super.move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.Movelegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move called");
        moveLegs(speed);
        super.move(speed);
    }
}
