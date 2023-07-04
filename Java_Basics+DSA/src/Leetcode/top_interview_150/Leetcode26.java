package Leetcode.top_interview_150;

import java.util.HashSet;

public class Leetcode26 {

    public static void main(String[] args) {
        int []nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }
            else{
                set.add(nums[i]);
                nums[c++]=nums[i];
            }
        }
        return c;
    }
}
