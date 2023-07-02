package com.company2;

import java.util.Arrays;

public class Leetcode169 {
    public static void main(String[] args) {
        int[] arr = {2,5,4,8,8,8,8,9,6,0};
//        System.out.println(max(arr));
        System.out.println(majorityElement(arr));

    }
    static int majorityElement(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        Arrays.sort(arr);
        int count =0;
        int k=0;
        int max =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
                if(count >max){
                    max=count;
                    k = arr[i];
                }
            }else{
                count =0;
            }
        }
        return k;
    }
}


