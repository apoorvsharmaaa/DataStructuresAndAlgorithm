package com.company2;

public class ArrayMaxElementIn {
    static int max(int arr[]) {
        int c = 0;
        for (int elements : arr) {
            if (c < elements) {
                c = elements;
            }

        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr = {45, 98, 32, 456, 1230, 0, 56, 79};
        System.out.println(max(arr));
    }
}

