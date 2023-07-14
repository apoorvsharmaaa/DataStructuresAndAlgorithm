package Leetcode.top_interview_150;

public class Leetcode55 {
    public static void main(String[] args) {
        int nums[] = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }

    private static boolean canJump(int[] nums) {
        int max_step = 0;
        for (int i = 0;i<nums.length;i++){
            if (max_step<i){
                return false;
            }
            else{
                max_step = Math.max(max_step,i+nums[i]);
            }
        }
        return true;
    }
}
