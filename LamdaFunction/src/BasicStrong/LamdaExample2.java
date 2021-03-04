package BasicStrong;

interface MyFunInterface2{
    public int findLenth(String s);
}
public class LamdaExample2 {
    public static void main(String[] args) {
        MyFunInterface2 funInterface2 = s -> s.length();
        int len = funInterface2.findLenth("lamda");
        System.out.println("length of the given string is "+len);
    }
}
