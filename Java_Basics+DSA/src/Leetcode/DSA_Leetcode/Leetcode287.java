package Leetcode.DSA_Leetcode;

import java.util.HashSet;

public class Leetcode287 {
    public static void main(String[] args) {
        int nums []= {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }

    private static int findDuplicate(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (set.contains(nums[i])){
                return nums[i];
            }else{
                set.add(nums[i]);
            }
        }
        return 0;
    }
}
