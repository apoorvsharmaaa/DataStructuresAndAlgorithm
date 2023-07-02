package com.company2;

public class Leetcode852{ //LEETCODE162
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 9, 81, 7, 5, 3};
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
        System.out.println(arr[start % arr.length]);
    }
}

