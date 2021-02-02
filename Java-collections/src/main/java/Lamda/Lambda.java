package Lamda;

import java.util.ArrayList;
import java.util.TreeSet;

public class Lambda {

    public static void main(String[] args) {

        ArrayList<myClass> list = new ArrayList<>();
        myClass v1 = new myClass("v1","abc");
        myClass v2 = new myClass("v2","xyz");
        myClass v3 = new myClass("v3","aby");
        list.add(v1);
        list.add(v2);
        list.add(v3);
     //   list.removeIf(m->m.getName().equals("abc"));
       // list.forEach(m-> System.out.println(m.getName()));

        TreeSet<myClass> treeSet = new TreeSet<>();
        treeSet.add(new myClass("111","abd0s"));
        treeSet.add(new myClass("222","abd1s"));
        treeSet.add(new myClass("333","abd2s"));

        //treeSet.forEach(myClass -> System.out.println(myClass));


        TreeSet<myClass> tree = new TreeSet<>(new MyComparator() );
        tree.add(new myClass("111","abds"));
        tree.add(new myClass("222","abd1s"));
        tree.add(new myClass("333","abd2s"));
        tree.forEach(m-> System.out.println(m));

    }
}
