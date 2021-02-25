package com.basicstrong.generics;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(30);
        s.push(true);
        Object o = s.pop();
    }
}
