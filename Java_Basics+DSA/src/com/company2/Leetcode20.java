package com.company2;

import java.util.HashSet;
import java.util.Stack;
import java.util.*;

public class Leetcode20 {
    public static void main(String[] args) {
        String s = "{}";
        System.out.println(isValid(s));

    }

    static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (cur == '(' || cur == '[' || cur == '{') {
                s.push(cur);
            } else {
                if (s.isEmpty() || (cur == ')' && s.peek() != '(') || (cur == ']' && s.peek() != '[') || (cur == '}' && s.peek() != '{')) {
                    return false;
                }
                s.pop();
            }
        }
        return s.isEmpty();
    }
}
//        String s = "( )";
//        System.out.println(isValid(s));
//    }
//    static boolean isValid(String s) {
//        String d1 = "( )";
//        String d2 ="()";
//        String d3 = "[ ]";
//        while (!s.isEmpty()) {
//            if (s.contains(d1)) {
//                s = s.replaceAll(d1, "");
//            } else if (s.contains(d2)) {
//                s = s.replaceAll(d2, "");
//            } else if (s.contains(d3)) {
//                s = s.replaceAll(d3, "");
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//}
