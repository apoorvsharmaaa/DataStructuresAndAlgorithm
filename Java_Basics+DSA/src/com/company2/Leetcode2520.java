package com.company2;

public class Leetcode2520 {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(countDigits(num));
    }
    private static int countDigits(int num) {
        int c=0;
        int val = num;
        while (val>0) {

            if (num %( val %10) == 0)
                c++;
                val/= 10;
            }

        return c;
    }
}
