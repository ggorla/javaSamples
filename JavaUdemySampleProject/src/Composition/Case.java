package Composition;

public class Case {
    private String model;
    private String manufacture;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacture, String powerSupply, Dimensions dimensions) {

        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }
    public  void  pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}
