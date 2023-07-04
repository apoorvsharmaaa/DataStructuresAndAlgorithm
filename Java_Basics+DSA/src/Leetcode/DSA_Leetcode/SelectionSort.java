package Leetcode.DSA_Leetcode;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int nums []= {5,4,9,6,3,0,-8,789};
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void selection(int nums[]){
        for (int i=0;i<nums.length;i++){
            int last = nums.length-i-1;
            int max = max(nums,0,last);
            swap(nums,max,last);
        }
    }
    static int max(int[] nums, int start, int end){
        int max = start;
        for (int i=start;i<=end;i++){
            if (nums[max]<nums[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int nums[],int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
