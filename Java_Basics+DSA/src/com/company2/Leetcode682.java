package com.company2;

import java.util.Arrays;
import java.util.Stack;

public class Leetcode682 {
    public static void main(String[] args) {
       String ops[] = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));
    }

    private static int calPoints(String[] operation) {
        Stack<Integer>stk = new Stack<>();
        for (int i = 0;i< operation.length;i++){
            if (operation[i] == "C"){
                stk.pop();
            } else if (operation[i]== "D") {
               int a =  stk.pop();
               int b = 2*a;
               stk.push(a);
               stk.push(b);
            } else if (operation[i]=="+") {
                int x = stk.pop();
                int y = stk.pop();
                int z = x+y;
                stk.push(y);
                stk.push(x);
                stk.push(z);
            }
            else {
                stk.push(Integer.parseInt(operation[i]));
            }
        }
        int sum=0;
        while(!stk.isEmpty()){
            sum+=stk.pop();
        }
        return sum;
    }
}

