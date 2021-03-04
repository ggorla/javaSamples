package BasicStrong;

public class DoubleColonMethodRefrence {
    public static void main(String[] args) {

        MyFunctionalInterface functionalInterface = ()-> System.out.println("I am lamda");
        functionalInterface.method1();

    }
    public static void method2(){
        System.out.println("I am not Lamda");
    }

    public  void method3(){
        System.out.println("I am not Lamda");
    }
}
interface MyFunctionalInterface{
    public  void  method1();
}
class NewCallerClass{
    public static void main(String[] args) {
        MyFunctionalInterface i = DoubleColonMethodRefrence::method2;
        i.method1();

        DoubleColonMethodRefrence obj = new DoubleColonMethodRefrence();
        myFunctionalInterface i1  = obj::method3;
        i.method1();
    }
}
