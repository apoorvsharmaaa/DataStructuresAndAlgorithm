package Leetcode.Leetcode_Daily_Question;

public class Leetcode1493 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1};
        System.out.println(longestSubarray(nums));
    }

    private static int longestSubarray(int[] nums) {
        int start = 0, end = 0;
        int zero = 0;
        int max = 0;
        while(end < nums.length){
            if(nums[end] == 0) zero++;
            while(zero > 1){
                if(nums[start] == 0) zero--;
                start++;
            }
            max = Math.max(max, end - start + 1);
            end++;
        }
        return max - 1;
    }
}
