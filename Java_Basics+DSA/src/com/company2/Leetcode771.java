package com.company2;

import java.util.HashSet;

public class Leetcode771 {
    public static void main(String[] args) {
        String jewels = "ebd";
        String stones = "bbb";
        System.out.println(numJewelsInStones( jewels, stones));
    }

    private static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for (char ch : jewels.toCharArray()){
            set.add(ch);
        }
        for (int j = 0;j<stones.length();j++) {
            if (set.contains(stones.charAt(j))) {
                count++;
            }
        }
        return count;
    }
}
