package Leetcode.DSA_Leetcode;

import java.util.Stack;

public class Leetcode1021 {
    public static void main(String[] args) {
       String  s = "(()())(())";
        System.out.println(removeOuterParentheses( s));
    }

    private static String removeOuterParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i=0;i<s.length();i++) {
            char cur = s.charAt(i);
            if (( cur == '(' && stk.isEmpty() && stk.peek() == '(') ||( cur == ')'&& stk.peek() == ')')){
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
