package Polymorphism;

class Car{
    private  boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels =4;
        this.engine = true;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String startEngine(){
        return "cat-> StartEngine()";
    }
    public String accelerate(){
        return "car-> accelerate()";

    }
    public String brake(){
        return" Car-> Break";
    }

}
class Mastubish extends Car{
    public Mastubish(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mistubish ->Startenging";
    }

    @Override
    public String accelerate() {
        return "Mistubish ->accelerate";
    }

    @Override
    public String brake() {
        return "Mistubish ->break";
    }
}
public class Main {

}
