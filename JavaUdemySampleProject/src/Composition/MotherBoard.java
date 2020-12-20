package Composition;

public class MotherBoard {
    private String model;
    private  String manfacture;
    private  int ramSlots;
    private int cardSlots;
    private  String bios;

    public String getModel() {
        return model;
    }

    public void  loadprogram(String programName){
        System.out.println("Program"+programName+"is now  loading....");
    }
    public String getManfacture() {
        return manfacture;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public MotherBoard(String model, String manfacture, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manfacture = manfacture;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
}
