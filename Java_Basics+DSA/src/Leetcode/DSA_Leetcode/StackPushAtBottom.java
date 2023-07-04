package Leetcode.DSA_Leetcode;

import java.util.*;

public class StackPushAtBottom {
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s);

        pushing(4,s);

        System.out.println(s);


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
