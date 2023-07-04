package Leetcode.DSA_Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leetcode2215 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        System.out.println(findDifference(nums1,nums2));

    }

    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> ans1 = new ArrayList<Integer>();
        List<Integer> ans2 = new ArrayList<Integer>();
        HashSet<Integer> set1 = new HashSet<Integer>();
       HashSet <Integer> set2 = new HashSet<Integer>();

       for (int n:nums1){
           set1.add(n);
       }
        for (int j:nums2){
            set2.add(j);
        }
        for (int k: set1){
            if (!set2.contains(k)){
                ans1.add(k);
            }
        }
        for (int k: set2){
            if (!set1.contains(k)){
                ans2.add(k);
            }
        }
        ans.add(ans1);
        ans.add(ans2);
        return ans;
    }
}
