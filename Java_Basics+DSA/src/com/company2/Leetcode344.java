package com.company2;

import java.util.Arrays;

public class Leetcode344 {
    public static void main(String[] args) {
        String[] s = {"a", "b", "c", "d"};
        for (int i = 0; i < s.length / 2; i++) {
            String temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}