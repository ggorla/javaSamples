package BasicStrong;

interface MyFunction3{
    public  int dosomeCal(int a);
}
public class LamdaExample3 {
    public static void main(String[] args) {
        MyFunction3 lamdaresults = a -> {
            int x = a+10;
            x = x/2;
            return x;
        };
        int ops = lamdaresults.dosomeCal(100);
        System.out.println(ops);
    }
}
