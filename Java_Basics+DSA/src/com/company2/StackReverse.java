package com.company2;

import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }
    private static void reverse(Stack<Integer>s){
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushing(top,s);
    }
    private static void pushing(int data, Stack<Integer>s){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushing(data,s);
        s.push(top);

    }
}
