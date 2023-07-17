package Leetcode.DSA_Leetcode;

import java.util.Stack;

public class Leetcode445 {
    public static void main(String[] args) {
       int[] l1 = {7,2,4,3};
       int[] l2 = {5,6,4};
        System.out.println(addtwoNumbers(l1,l2));
    }
    private static Stack<Integer> addtwoNumbers(int []a, int []b){
        Stack<Integer> stk = new Stack<>();
        for (int i=a.length;i<0;i++){
            stk.push(a[i]+b[i]);

        }
        return stk;

    }
}
