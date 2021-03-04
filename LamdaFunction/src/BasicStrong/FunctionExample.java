package BasicStrong;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        String s = "test";
        Function<String, Integer> len = str->str.length();
        int i = len.apply(s);
        System.out.println("Lenth "+i);
    }
}
