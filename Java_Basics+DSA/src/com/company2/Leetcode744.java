package com.company2;

public class Leetcode744 {
    public static void main(String[] args) {
        char [] arr = {'s','d','c','b','a'};
        char target = 'c';
        int ans = binarysearch(arr,target);
        System.out.println(ans);


    }
    static int binarysearch(char [] arr, char target){
        int start = 0;
        int end = arr.length-1;


        while (start <=end){
//            int mid = (start + end)/2;
            int mid = start +(end - start)/2; //same upper wala ki traf ek or formula jo use hota h for long array jab array mai bahut saare elements ho!!!!1

            if (target < arr[mid]){
                end = mid -1;


            } else if (target> arr[mid]) {
                start = mid+1;

            }else {
                return mid;
            }
        }
        return arr[start % arr.length];
    }
}

