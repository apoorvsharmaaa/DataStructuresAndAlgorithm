package Leetcode.DSA_Leetcode;

import java.util.HashSet;

public class Leetcode136 {
    public static void main(String[] args) {
        int[] nums = {1,0,1,3,0};
        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        if (s == e) {
            return nums[s];
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }
}
