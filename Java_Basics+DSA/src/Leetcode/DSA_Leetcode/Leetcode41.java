package Leetcode.DSA_Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Leetcode41 {
    public static void main(String[] args) {
        int nums[] = {4,2,1,-1};
        System.out.println(firstMissingPositive(nums));
    }
    static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int l= nums.length-1;
        int a=nums[l];
        HashSet<Integer>set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int i=1;
        while(i!=-1)
        {
           if(!set.contains(i)) {
               return i;
           }
           i++;
        }
        return i;
    }
}