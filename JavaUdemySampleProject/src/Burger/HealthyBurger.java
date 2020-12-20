package Burger;

public class HealthyBurger  extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");

    }
    public void addHealthuAddtion1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public  void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }
}
