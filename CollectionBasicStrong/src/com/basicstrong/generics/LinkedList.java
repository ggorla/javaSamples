package com.basicstrong.generics;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList l = new java.util.LinkedList();
        l.add("John");
        l.add(10);
        l.add(null);
        System.out.println(l);
        l.set(1,13);
        System.out.println(l);
        l.add(2,true);
        System.out.println(l);
        l.remove(2);
    }
}
