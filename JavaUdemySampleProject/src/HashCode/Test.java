package HashCode;

public class Test {
    public static void main(String[] args) {
        Human test1 = new Human(1001, "test1");
        Human test2 = new Human(1002, "test2");

        boolean result = test1.equals(test2);
        System.out.println(result);

    }
}
