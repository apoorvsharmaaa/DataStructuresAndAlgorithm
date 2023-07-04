package Leetcode.DSA_Leetcode;

public class Leetcode2348 {
    public static void main(String[] args) {
        int nums[] = {1, 3, 0, 0, 2, 0, 0, 4};
        System.out.println(zeroFilledSubarray(nums));
    }

    private static long zeroFilledSubarray(int[] nums) {
        int count = 0;
        int Subarray = 0;
//        long ans=0;
        for (int num : nums) {
            if (num == 0)
                Subarray++;
            else
                Subarray = 0;
            count = count + Subarray;
        }

        return count;
    }
}