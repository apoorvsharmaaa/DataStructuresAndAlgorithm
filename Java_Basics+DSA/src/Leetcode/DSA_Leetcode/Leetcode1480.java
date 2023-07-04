package Leetcode.DSA_Leetcode;
public class Leetcode1480 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(runningSum( nums));
    }
    private static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}
