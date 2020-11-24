import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class filterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Test","me","here","class");
        //regular way
        for (String name : names) {
            if (!name.equals("me")) {
                System.out.println(name);
            }
        }

        //with not extraxted
        names.stream()
                .filter(name -> !name.equals("test"))
                .forEach(name-> System.out.println(name));

        //with extracted
        names.stream()
                .filter(filterExample::isNotSam)
                .forEach(System.out::println);


    }
    private static boolean isNotSam(String name){
        return  !name.equals("sam");
    }
}
