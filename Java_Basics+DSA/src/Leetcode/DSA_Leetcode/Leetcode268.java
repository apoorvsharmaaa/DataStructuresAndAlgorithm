package Leetcode.DSA_Leetcode;

import java.util.Arrays;

public class Leetcode268 {
    public static void main(String[] args) {
        int[] nums = {5,6,7,2,3, 0, 1};
        Arrays.sort(nums);
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]) {
                num = num+1;
            }


        }
        System.out.println(num);
    }
}
