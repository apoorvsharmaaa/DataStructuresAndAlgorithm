package com.company2;

public class BinarySearch2 {
    public static void main(String[] args) {
        int [] arr = {99,88,77,66,55,44,33,22,11,0,-4,-6,-89,-100};
        int target = 11;
        int ans = binarysearch(arr,target);
        System.out.println(ans);

    }
    static int binarysearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <=end){
//            int mid = (start + end)/2;
            int mid = start +(end - start)/2; //same upper wala ki traf ek or formula jo use hota h for long array jab array mai bahut saare elements ho!!!!1

            if (target > arr[mid]){
                end = mid -1;

            } else if (target < arr[mid]) {
                start = mid+1;

            }else {
                return mid;
            }
        }
        return -1;
    }
}

