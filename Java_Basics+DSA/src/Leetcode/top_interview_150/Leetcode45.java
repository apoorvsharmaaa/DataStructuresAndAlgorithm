package Leetcode.top_interview_150;

public class Leetcode45 {
    public static void main(String[] args) {
        int nums []={2,3,1,1,4};
        System.out.println(jump(nums));
    }
    public static int jump(int[] nums) {
        int n = nums.length;
        int max_steps = 0;
        int cur = 0;
        int jumps = 0;

        for (int i = 0; i < n - 1; i++) {
            max_steps = Math.max(max_steps, i + nums[i]);
            if (cur == i) {
                cur = max_steps;
                jumps++;
            }
        }
        return jumps;
    }
}
