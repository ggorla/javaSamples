package BasicStrong;

interface  MyFunctionInterface{
    public void funMethodAdd(int a, int b);
}
class CallFunInterface implements MyFunctionInterface{
    @Override
    public void funMethodAdd(int a, int b) {
        System.out.println("sum of a and be is "+(a+b));
    }
}
public class LambdaExample1 {
    public static void main(String[] args) {
        MyFunctionInterface functionInterface = new CallFunInterface();
        functionInterface.funMethodAdd(2,3);

        MyFunctionInterface lamdaFunctionInterface = (a,b)-> System.out.println("add from lamda "+(a+b));
        lamdaFunctionInterface.funMethodAdd(10,20);
    }
}
