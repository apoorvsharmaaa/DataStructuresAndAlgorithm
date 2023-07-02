package com.company2;

public class Leetcode1456 {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;

        System.out.println(maxVowels(s, k));
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private static int maxVowels(String s, int k) {
        int n = s.length();
        int res = 0;
        int total = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i)))
                total++;
        }
        res = total;
        int left = 0;
        while (left + k < n) {
            int right = left + k;
            if (isVowel(s.charAt(left))) total--;
            left++;
            if (isVowel(s.charAt(right))) total++;
            res = Math.max(res, total);
        }
        return res;
    }
}

