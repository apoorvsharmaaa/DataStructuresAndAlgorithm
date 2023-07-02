package com.company2;
public class Leetcode1 {
    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int target = 9;
        int arr[] = twoSum(nums,target);
        System.out.println(arr);
    }

    static int[] twoSum(int[] nums, int target) {
        int res[]= new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    res[0] =i;
                    res[1]= j;
                }
            }
        }
        return res;
    }
}

