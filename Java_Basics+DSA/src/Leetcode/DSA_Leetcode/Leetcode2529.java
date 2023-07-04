package Leetcode.DSA_Leetcode;

public class Leetcode2529 {
    public static void main(String[] args) {
        int [] nums = {-2,-1,-1,1,2,3};
        System.out.println();
    }
    private static int maximumCount(int[] nums){
        int c = 0;
        int p = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<0){
                c++;
            }
            if(nums[i]>0){
                p++;
            }
        }
        if(c>p){
            return c;
        }
        return p;

    }
}
