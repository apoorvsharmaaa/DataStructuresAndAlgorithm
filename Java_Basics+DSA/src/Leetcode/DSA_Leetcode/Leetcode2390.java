package Leetcode.DSA_Leetcode;

import java.util.Stack;

public class Leetcode2390 {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }

    private static String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '*') {
                st.pop();

            } else {
                st.push(cur);
            }
        }
           StringBuilder sb = new StringBuilder();
            while (!st.isEmpty()) {
                sb.append(st.pop());
            }
        return sb.reverse().toString();
    }
}