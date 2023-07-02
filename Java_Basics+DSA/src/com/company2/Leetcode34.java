package com.company2;

public class Leetcode34 {
    public static void main(String[] args) {
//        int arr [] = {4,5,6,6,7,8,8,9};
//        int target = 6;
//        int ans = binarysearch(arr,target);
//        System.out.println(ans);
    }

    public int[] binarysearch(int[] nums, int target) {

        int[] ans = {-1, -1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0] =  start;
        ans[1] = end;

        return ans;
    }

    int search(int[] nums, int target, boolean findstartindex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;

            } else if (target > nums[mid]) {
                start = mid + 1;

            } else {
                ans = mid;
                if (findstartindex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}


