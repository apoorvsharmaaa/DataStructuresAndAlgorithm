package com.company2;

public class Leetcode33 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 4;
        System.out.println(findPivot(nums));

    }
    static int search(int[] nums , int target){
        int pivot =findPivot(nums);

        if (pivot == -1){
            return binarysearch(nums,target,0,nums.length-1);

        }
        if (nums[pivot] == target){
            return pivot;
        }
        if (target>=nums[0]){
            return binarysearch(nums,target,0,pivot-1);
        }
            return binarysearch(nums,target,pivot+1, nums.length-1);

    }
    static int binarysearch(int [] arr, int target,int start , int end){
        while (start <=end){

            int mid = start +(end - start)/2;

            if (target < arr[mid]){
                end = mid -1;

            } else if (target> arr[mid]) {
                start = mid+1;

            }else {
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;

            //4 cases
            if (mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if (mid > start && nums[mid-1]>nums[mid]){
                return mid-1;
            }
            if (nums[start]>=nums[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;

    }
}
