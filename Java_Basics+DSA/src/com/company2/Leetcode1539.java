package com.company2;

import java.util.HashSet;

public class Leetcode1539 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int k = 2;
        System.out.println( findKthPositive(arr, k));
    }

    private static int findKthPositive(int[] arr, int k) {
        HashSet<Integer>set = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int [] val = new int[arr.length+k];
        int a = 0;
        for (int j = 1;j<arr.length+k+1;j++){
            if (!set.contains(j)){
                val[a++] = j;
            }
        }
        return val[k-1];

    }
}
