package Calculator;

public class SimpleCalculator {
    private double FirstNumber;
    private double SecondNumber;
    public  void setFirstNumber(double FirstNumber){
        this.FirstNumber = FirstNumber;
    }

    public double getFirstNumber() {
        return this.FirstNumber;
    }

    public double getSecondNumber() {
        return this.SecondNumber;
    }

    public  void setSecondNumber(double SecondNumber){
        this.SecondNumber = SecondNumber;
    }

    public double getadditionResult(){
        return (this.FirstNumber+this.SecondNumber);
    }
    public double getSubstractionResult(){
        return (this.FirstNumber-this.SecondNumber);
    }
    public double getMulsiplicationResult(){
        return (this.FirstNumber*this.SecondNumber);
    }
}
