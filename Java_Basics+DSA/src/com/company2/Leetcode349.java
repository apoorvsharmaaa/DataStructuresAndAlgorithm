package com.company2;

import java.util.HashSet;
import java.util.Set;

public class Leetcode349 {
    public static void main(String[] args) {
       int[] nums1 = {1,2,2,1};
        int[]nums2 = {2,2};
        System.out.println(intersection(nums1,nums2));

    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }
        Set<Integer> finalSet = new HashSet<>();
        for (Integer var : set1) {
            if (set2.contains(var)) {
                finalSet.add(var);
            }
        }
        int[] arr = new int[finalSet.size()];
        int idx = 0;
        for (Integer value : finalSet) {
            arr[idx] = value;
            idx++;
        }
        return arr;
    }
}