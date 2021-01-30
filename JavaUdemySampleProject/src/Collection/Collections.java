package Collection;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Lars","Simon");
        List<String> anotherList = new ArrayList<>();

        list.removeIf(s -> s.toLowerCase().contains("Lars"));
        list.forEach(s-> System.out.println(s));
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Ravi");
        list1.add("Vijay");
        list1.add("Ravi");
        list.add("Ajay");

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("name");
        linkedList.add("test");
        Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(itr.next());
        }
    }
}
