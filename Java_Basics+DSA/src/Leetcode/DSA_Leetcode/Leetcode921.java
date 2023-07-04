package Leetcode.DSA_Leetcode;

import java.util.Stack;

public class Leetcode921 {
    public static void main(String[] args) {
       String s = "())";
        System.out.println(minAddToMakeValid(s));
    }

    private static int minAddToMakeValid(String s) {

        Stack<Character> stk = new Stack<>();
        int c = 0;
        for (int i=0;i<s.length();i++) {
            char cur = s.charAt(i);
            if (cur == '(' || cur== ')' &&stk.isEmpty() || cur ==')' &&stk.peek()==')'){
                stk.push(cur);
                c++;
            } else
                if (cur == ')' && stk.peek() == '(') {
                stk.pop();
                c--;
            }
            }

        return c;
    }
}
