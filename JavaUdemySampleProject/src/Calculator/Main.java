package Calculator;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(2.0);
        simpleCalculator.setSecondNumber(3.0);
        System.out.println(simpleCalculator.getadditionResult());

    }
}
