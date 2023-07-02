package com.company2;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class Leetcode220 {
    public static void main(String[] args) {
        int[] nums = {1, 2,3,1};
        int indexDiff = 3;
        int valueDiff = 0;
        System.out.println(containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff));
    }

    static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (nums.length == 0 || indexDiff <= 0 || valueDiff < 0) return false;
        int p1 = 0, p2 = 1;
        if (valueDiff == 0) {
            Map<Integer, Integer> m = new HashMap<>();
            m.put(nums[p1], p1);
            while (p1 < nums.length - 1) {
                if (m.containsKey(nums[p2]) && m.get(nums[p2]) != p2) return true;
                m.put(nums[p2], p2);
                if (p2 - p1 < indexDiff && p2 < nums.length - 1) p2++;
                else m.remove(nums[p1++]);
            }
        } else {
            while (p1 < nums.length - 1) {
                long tmp = (long) nums[p1] - nums[p2];
                if (abs(tmp) <= valueDiff) return true;
                else if (p2 - p1 < indexDiff && p2 < nums.length - 1) p2++;
                else p2 = ++p1 + 1;
            }
        }
        return false;
    }
}