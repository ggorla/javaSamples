package Encapsulation;

public class Printer {
    private int tonerLevel;
    private  int pagePrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel> -1 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagePrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100){
            if(this.tonerLevel+tonerAmount>100){
                return -1;
            }

            return  this.tonerLevel+tonerAmount;

        }else{
            return -1;
        }
    }
    public int printPages(int pages){
        int pagesToPring = pages;
        if(this.duplex){
            pagesToPring  =(pages/2)+(pages%2);
            System.out.println("Printing in duplex mode");
        }
        this.pagePrinted +=pagesToPring;
        return pagesToPring;
    }
}
