package com.company2;

import java.util.HashSet;

public class Leetcode28 {
    public static void main(String[] args) {
       String haystack = "sadbutsad", needle = "sadi";
        System.out.println(haystack.length());
        System.out.println( strStr(haystack, needle));
    }

     static int strStr(String haystack, String needle) {
        int l1 = needle.length();
        int l2= haystack.length();
        if (l2 < l1) {
            return -1;
        }
        for (int i = 0; i <= l2-l1 ; i++) {
            if (haystack.substring(i, i + l1).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
