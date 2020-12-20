package Composition;

public class PC {
    private  Case aCase;
    private Monitor monitor;
    private  MotherBoard motherBoard;


    public PC(Case aCase, Monitor monitor, MotherBoard motherBoard) {

        this.aCase = aCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
    public void powerUp(){
        aCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo()
    {
        monitor.drawPixelAt(1200,50,"yellow");
    }
}
