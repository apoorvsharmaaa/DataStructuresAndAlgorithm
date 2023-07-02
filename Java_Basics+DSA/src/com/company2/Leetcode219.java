package com.company2;

import java.util.HashMap;

import static java.lang.Math.abs;

public class Leetcode219 {
    public static void main(String[] args) {
        int []nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums,k));

    }
     static boolean containsNearbyDuplicate(int[] nums, int k) {
         HashMap<Integer,Integer> s = new HashMap<>();
         for (int i=0;i<nums.length;i++) {
             if (s.containsKey(nums[i])) {
                 int p = i - s.get(nums[i]);
                 if (k >= p) {
                     return true;
                 }
             }
              s.put(nums[i], i);
             }
         return false;
    }
}
