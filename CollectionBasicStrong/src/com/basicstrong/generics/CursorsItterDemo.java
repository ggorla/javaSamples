package com.basicstrong.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class CursorsItterDemo {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(12);
        data.add(23);
        data.add(36);
        Iterator itr = data.iterator();

        while(itr.hasNext()){
            Integer ele = (Integer) itr.next();
            if(ele%3==0){
                System.out.println(ele);
            }else
                itr.remove();
        }
    }
}
