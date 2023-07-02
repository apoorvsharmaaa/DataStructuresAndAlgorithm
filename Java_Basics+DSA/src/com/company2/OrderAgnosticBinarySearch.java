package com.company2;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int arr [] = {4,5,6,9,12,13,15,26};
        int arr[] = {9,8,7,6,5,4,3,2,1,0};
        int target = 5;
        int ans = orderagnosticbinarysearch(arr,target);
        System.out.println(ans);
    }

    static int orderagnosticbinarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // checking the array is in ascending order or descending order....
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
//            int mid = (start + end)/2;
            int mid = start + (end - start) / 2; //same upper wala ki traf ek or formula jo use hota h for long array jab array mai bahut saare elements ho!!!!1

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
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
