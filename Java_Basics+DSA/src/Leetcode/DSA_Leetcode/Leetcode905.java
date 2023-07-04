package Leetcode.DSA_Leetcode;

import java.util.Arrays;

public class Leetcode905 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        sortArrayByParity(nums);
    }

    static void sortArrayByParity(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                int temp = nums[j];
                nums[i++] = nums[j];
                nums[j] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}