import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatMapperExample {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
            new User("Peter",20, Arrays.asList("1","2")),
                new User("Sam",40, Arrays.asList("3","2","5")),
                new User("Ryan",60, Arrays.asList("6")),
                new User("Adam",70, Arrays.asList("7","8"))

        );

       Optional<String> stringOptional = users.stream()
               .map(user -> user.getPhoneNum().stream())
               .flatMap(stringStream -> stringStream.filter(phonNo-> phonNo.equals(("5"))))
               .findAny();

       stringOptional.ifPresent(System.out::println);


    }
    private static boolean isNotSam(String name){
        return  !name.equals("sam");
    }

    static class User{
        private String name;
        private Integer age =30;
        private  List<String> phoneNum;

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

        public List<String> getPhoneNum() {
            return phoneNum;
        }

        public void setPhoneNum(List<String> phoneNum) {
            this.phoneNum = phoneNum;
        }

        public User(String name, Integer age, List<String> phoneNum) {
            this.name = name;
            this.age = age;
            this.phoneNum = phoneNum;
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
