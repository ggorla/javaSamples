package Basics;

import java.util.Collections;
import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> aList = new java.util.ArrayList<String>();
        aList.add("Steve");
        aList.add("Tim");
        aList.add("Lucy");
        aList.add("Pat");
        aList.add("Angela");
        System.out.println(aList);
        //adding element in postion
        aList.add(3,"Mike");
        // replacing or changing value
        aList.set(0,"GG");
        System.out.println("Printing Name"+ aList);
        Iterator itr = aList.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        //sorting array elements
        Collections.sort(aList);
        System.out.println(aList);
    }

}
