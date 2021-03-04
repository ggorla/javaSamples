package BasicStrong;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> str= s-> System.out.println(s);
        str.accept("Consumer");
    }
}
