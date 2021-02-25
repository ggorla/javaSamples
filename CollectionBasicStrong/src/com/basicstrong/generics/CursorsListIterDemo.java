package com.basicstrong.generics;

import java.util.ArrayList;
import java.util.ListIterator;

public class CursorsListIterDemo {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("raj");
        data.add("Ramesh");
        data.add("Amrish");
        data.add("Jai");
        data.add("Kushal");

        ListIterator li = data.listIterator();
        while(li.hasNext()){

        }

    }
}
