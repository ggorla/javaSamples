package Composition;

public class Main {
    public static void main(String[] args) {
        /*Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimensions);
        Monitor theMoniter = new Monitor("27 inch","Acer", 27,new Resolution(2540,1440));
        MotherBoard motherBoard = new MotherBoard("Bj-200","Asus",4,6,"v3.44");
        PC thepc = new PC(theCase,theMoniter,motherBoard);
        thepc.powerUp();
*/
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        celling celling = new celling(12,55);
        Bed bed = new Bed("Modern",4,3,2,1);
        Lamp lamp = new Lamp("Classic", false,75);
        BedRoom bedRoom = new BedRoom("Tims", wall1,wall2,wall3,wall4,celling,bed,lamp);
        bedRoom.makeBead();
        bedRoom.getLamp().turnOn();

    }

}
