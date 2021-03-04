package com.basicstrong.Concurrent;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread{
    static  ConcurrentHashMap<Integer,String> map  = new ConcurrentHashMap<Integer,String>();
    public static void main(String[] args) {
        ConcurrentHashMapDemo tchild = new ConcurrentHashMapDemo();
        ConcurrentHashMap<Integer, String> conmap = new ConcurrentHashMap<>();
        map.put(0,"Basic");
        map.put(1,"Strong");
        map.put(2,"Tom");

        tchild.start();
        Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry entry;
            entry = itr.next();
            System.out.println("Key="+entry.getKey()+"value="+entry.getValue());
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }

    }
    public void run() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {

        }
        map.put(4,"Ganesh");
    }
}
