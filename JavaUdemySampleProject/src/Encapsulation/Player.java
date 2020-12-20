package Encapsulation;

public class Player {
    public String name;
    public int health;
    public  String wepon;

    public void loseHealth(int damage){
        this.health = this.health-damage;
        if(this.health<=0){
            System.out.println("player knocked out");
        }
    }
    public int healthRemaing(){
        return  this.health;
    }
}
