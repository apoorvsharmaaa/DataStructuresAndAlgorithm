package Leetcode.DSA_Leetcode;

public class Leetcode413 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        System.out.println( numberOfArithmeticSlices(nums));
    }

    private static int numberOfArithmeticSlices(int[] nums) {
        int curr = 0;
        int total = 0;
        for(int i = 2;i < nums.length;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                curr++;
                total = total + curr;
            }else{
                curr = 0;
            }
        }
        return total;
    }
}
