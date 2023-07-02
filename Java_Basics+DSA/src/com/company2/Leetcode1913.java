package com.company2;

import java.util.Arrays;

public class Leetcode1913 {
    public static void main(String[] args) {
        int [] nums = {4,2,5,9,7,4,8};
        System.out.println( maxProductDifference(nums));
    }

    private static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        int a = nums[0]*nums[1];
        int b = nums[l-1]*nums[l-2];
        return b-a;
    }
}
