package com.company2;

import java.math.BigInteger;

public class Leetcode67 {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a,b));
    }
    static String addBinary(String a, String b) {
        BigInteger A = new BigInteger(a,2);
        BigInteger B = new BigInteger(b,2);
        BigInteger C = A.add(B);
        return (C.toString(2));
    }
}
