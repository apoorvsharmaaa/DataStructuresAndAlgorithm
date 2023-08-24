package Leetcode.DSA_Leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Leetcodee136 {
    public static void main(String[] args) {
        int nums[] = {2, 2, 1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if (stk.isEmpty()&&stk.peek() == nums[i]) {
                stk.push(stk.peek());
            } else {
                stk.push(nums[i]);
            }
        }

        for (int a : stk) {
            return a;
        }
        return -1;
    }
}
