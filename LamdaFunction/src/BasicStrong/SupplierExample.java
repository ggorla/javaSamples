package BasicStrong;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> s = ()-> "supplier";
        s.get();
    }
}
