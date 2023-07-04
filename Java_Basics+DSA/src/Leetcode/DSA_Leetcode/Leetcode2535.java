package Leetcode.DSA_Leetcode;

public class Leetcode2535 {
    public static void main(String[] args) {
        int[] nums = {1, 15, 6, 3};
        System.out.println(differenceOfSum(nums));
    }

    private static int differenceOfSum(int[] nums) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < nums.length; i++) {
            x += nums[i];
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > 9) {
                nums[j] = nums[j] % 10;
                j = j / 10;
                y += nums[j];
            } else {
                y += nums[j];
            }
        }
        return x-y;
    }
}
