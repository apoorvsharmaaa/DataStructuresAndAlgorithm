package com.company2;

public class Leetcode1095 {
    public static void main(String[] args){
       int arr[] = {1,2,3,5,8,7,6,3};
       int target = 3;

    }


    int search(int[] arr, int target) {
        int peak = peakIndexInMountain(arr);
        int FirstTry = orderagnosticbinarysearch(arr, target , 0,peak );
        if (FirstTry != -1) {
            return FirstTry;
        }
        return orderagnosticbinarysearch(arr , target , peak +1, arr.length-1);
    }

public int peakIndexInMountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;

            }
        }
        return start;
    }
    static int orderagnosticbinarysearch(int[] arr, int target , int start, int end) {
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;

            }
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
