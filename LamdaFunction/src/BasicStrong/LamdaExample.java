package BasicStrong;

public class LamdaExample {
    public static void main(String[] args) {

        FunInterfaceExample i = new ImplFunterfaceExample();
        i.funMethod();

        FunInterfaceExample lamdaExample =()-> System.out.println("Functional without any argument lamda");
        lamdaExample.funMethod();
    }
}

interface FunInterfaceExample{
    public void funMethod();
}

class  ImplFunterfaceExample implements FunInterfaceExample{
    @Override
    public void funMethod() {
        System.out.println("Funtional Without any Argument");
    }
}