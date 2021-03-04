package BasicStrong;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        int salary = 3000;

        Predicate<Integer> p = i ->i>=4000;
        boolean result = p.test(salary);
        System.out.println(result);
    }
}
