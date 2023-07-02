package com.company2;

import java.util.Arrays;

public class Leetcode242 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t) {
        char arr[] = s.toCharArray();
        char arr1[] = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i] == arr1[i]) {
                return true;
            }
        }
        return false;
    }
}

