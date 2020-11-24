import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapperIntExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Test","me","here","class");
        //regular way
        System.out.println("Imperative Style:");
        for (String name : names) {
            if (!name.equals("me")) {
                System.out.println(name);
            }
        }

        //with extracted
        names.stream()
                .filter(mapperIntExample::isNotSam)
                .map(User::new)
                .forEach(System.out::println);

        //with Collect
        List<User> userList = names.stream()
                .filter(mapperIntExample::isNotSam)
                .map(User::new)
                .collect(Collectors.toList());

        userList.stream()
                .mapToInt(User::getAge);
    }
    private static boolean isNotSam(String name){
        return  !name.equals("sam");
    }

    static class User{
        private String name;
        private Integer age =30;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public User(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
