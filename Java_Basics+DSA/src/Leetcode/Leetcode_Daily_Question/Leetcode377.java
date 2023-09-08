package Leetcode.Leetcode_Daily_Question;

public class Leetcode377 {
    public static void main(String[] args) {
       int [] nums = {1,2,3};
       int target = 4;
        System.out.println(combinationSum4(nums,target));
    }
    public static int combinationSum4(int[] nums, int target) {
        var dp = new int[target + 1];
        dp[0] = 1;

        for (var i=1; i <= target; i++)
            for (var num : nums)
                dp[i] += i - num >= 0 ? dp[i - num] : 0;

        return dp[target];
    }
}
