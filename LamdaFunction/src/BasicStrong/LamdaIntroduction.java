package BasicStrong;

public class LamdaIntroduction {

    public static void main(String[] args) {
        /*
        Old way
        CallFunInterface funInterface = new CallFunInterface();
        funInterface.funMethod();
        */
        myFunctionalInterface functionalInterface = ()-> System.out.println("Functional Interface");
        functionalInterface.funMethod();
    }
}

interface myFunctionalInterface{
    public void funMethod();
}

/*old way
class CallFunInterface implements myFunctionalInterface{
    @Override
    public void funMethod() {
        System.out.println("Functional Method");

    }
}

 */