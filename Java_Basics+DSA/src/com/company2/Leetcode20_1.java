package com.company2;

import java.util.Stack;

public class Leetcode20_1 {
    public static void main(String[] args) {
      String  s = "()";
        System.out.println(isValid(s));

    }
    private static boolean isValid(String str){
        Stack<Character>s = new Stack<>();
        for (int i=0;i<str.length();i++){
            char cur = str.charAt(i);
            if (cur == '(' || cur== '{' || cur==  '['){
                s.push(cur);
            } else {
                if (s.isEmpty() || (cur == ')' && s.peek() != '(') || (cur == '}' && s.peek() != '{') || (cur == ']' && s.peek() != '[')) {
                    return false;
                }
                s.pop();
            }
        }
        return s.isEmpty();
    }
}
