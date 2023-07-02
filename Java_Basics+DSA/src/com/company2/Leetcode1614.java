package com.company2;

import java.util.Stack;

public class Leetcode1614 {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    private static String maxDepth(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i=0;i<s.length();i++) {
            char cur = s.charAt(i);
            if (stk.isEmpty() || ( cur == '(' && stk.peek() == '(') ||( cur == ')'&& stk.peek() == ')')){
                stk.push(cur);
                stk.pop();
            }
            else {
                stk.push(cur);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()) {
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}

