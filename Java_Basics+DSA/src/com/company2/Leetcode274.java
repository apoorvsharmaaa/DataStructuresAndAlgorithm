package com.company2;

public class Leetcode274 {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(hIndex(citations));

    }

    public static int hIndex(int[] citations) {
        int c = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= 3) {
                c++;
            }
        }
        return c;
    }
}
